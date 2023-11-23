const express = require('express');
const path = require('path');
const cookieSession = require('cookie-session');
const bcrypt = require('bcrypt');
const dbConnection = require('./database');
const { body, validationResult } = require('express-validator');
const { render, name } = require('ejs');

const app = express();
app.use(express.urlencoded({ extended: false }));    // แปลงข้อมูลจาก HTML เป็น JS 

app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

// app.use(express.static('views'));

app.use(cookieSession({
    name: 'session',
    keys: ['key1', 'key2'],
    maxAge: 3600 * 1000 // 1 ชั่วโมง
}));

const ifNotLoggedin = (req, res, next) => {
    if (!req.session.isLoggedIn) {         // เช็คว่าถ้าไม่มี request session หรือ ข้อมูลการล็อกอิน
        return res.render('Login');         // render ไปยังหน้า login-register
    }
    next();
}
const ifLoggedin = (req, res, next) => {
    if (req.session.isLoggedIn) {           // ถ้าหากมีการ login เข้ามา
        return res.redirect('/home');          // render ไปยังหน้า home
    }
    next();
}

app.get('/', ifNotLoggedin, (req, res, next) => {
    dbConnection.execute("SELECT `username` FROM `users` WHERE `id`=?", [req.session.userID])     // รันคำสั่ง sql และ เข้าถึง req.session.userid
        .then(([rows]) => {         // เช็คตาราง ว่ามีข้อมูลตาม req หรือไม่
            res.render('home', {       // หากมี render ไปยังหน้า home
                username: rows[0].username      // พร้อมด้วยข้อมูล name 
            });
        });
})

app.get('/contact_us', (req, res) => {                 // ลิ้งค์เชื่อมไปหน้า contact_us
    res.render('contact_us');
});

app.get('/choose-a-building', (req, res) => {                 // ลิ้งค์เชื่อมไปหน้า choose-a-building
    res.render('choose-a-building');
});

app.get('/Booking-history', (req, res) => {                 // ลิ้งค์เชื่อมไปหน้า Booking-history
    res.render('Booking-history');
});

app.get('/map', (req, res) => {                 // ลิ้งค์เชื่อมไปหน้า Booking-history
    res.render('map');
});

app.get('/choose-a-building/:name', (req, res) => {
    const Name = req.params.name;
    const bk_car = "0";
    const bk_date = "0";
    const bk_time = "0";
    const bk_status = "0";
    res.render('choose-bu1', { Name, bk_car, bk_date, bk_time , bk_status });
});

app.post('/ch-bu1', (req, res) => {
    const Name = req.body.fk_name;
    const bk_car = req.body.bk_car;
    const bk_date = req.body.bk_date;
    const bk_time = req.body.bk_time;
    const bk_status = "มีอยู่";
    res.render('choose-bu1', { Name, bk_car, bk_date, bk_time , bk_status});
});

app.post('/', ifLoggedin, [
    body('user_email').custom((value) => {
        return dbConnection.execute('SELECT email FROM users WHERE email=?', [value])
            .then(([rows]) => {
                if (rows.length == 1) {           // เช็ค true(1) false(0) หากมีอีเมลที่ตรงตามฐานข้อมูล 
                    return true;
                }
                return Promise.reject('Invalid Email Address!');

            });
    }),
    body('user_pass', 'Password is empty!').trim().not().isEmpty(),
], (req, res) => {
    const validation_result = validationResult(req);
    const { user_pass, user_email } = req.body;
    // console.log("Check" + validation_result?.isEmpty())

    if (validation_result.isEmpty()) {
        dbConnection.execute("SELECT * FROM `users` WHERE `email`=?", [user_email])
            .then(async ([rows]) => {
                console.log(rows)
                if (rows.length == 1) {
                    await bcrypt.compare(user_pass, rows[0].password)
                        .then(compare_result => {
                            // console.log(user_pass + " " + rows[0].password + " result : " + compare_result)
                            if (compare_result === true) {
                                req.session.isLoggedIn = true;
                                req.session.userID = rows[0].id;
                                res.redirect('/');
                            } else {
                                res.render('Login', {
                                    login_errors: ['Invalid Password!']
                                });
                            }
                        })
                        .catch(err => {
                            // Handle bcrypt compare error
                            console.error(err);
                            res.render('Login', {
                                login_errors: ['Error comparing passwords']
                            });
                        });
                } else {
                    // User not found
                    res.render('Login', {
                        login_errors: ['User not found']
                    });
                }
            })
            .catch(err => {
                // Handle database error
                console.error(err);
                res.render('Login', {
                    login_errors: ['Database error']
                });
            });
    }
    else {
        let allErrors = validation_result.errors.map((error) => {
            return error.msg;
        });
        // REDERING login-register PAGE WITH LOGIN VALIDATION ERRORS
        res.render('Login', {
            login_errors: allErrors
        });
    }
});

app.get('/logout', (req, res) => {
    //session destroy
    req.session = null;
    res.redirect('/');
});

app.listen(3000, () => console.log("Server is Running..."));
