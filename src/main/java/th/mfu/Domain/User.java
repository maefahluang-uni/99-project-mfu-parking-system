package th.mfu.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name="phonenumb")
    private String phonenumb;


    
    public User() {
        
    }



    public int getUserID() {
        return userID;
    }



    public void setUserID(int userID) {
        this.userID = userID;
    }



    public String getPhonenumb() {
        return phonenumb;
    }



    public void setPhonenumb(String phonenumb) {
        this.phonenumb = phonenumb;
    }

}