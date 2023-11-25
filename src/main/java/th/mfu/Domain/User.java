package th.mfu.Domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String phonenumb;
    

    public User(String phonenumb) {
        this.phonenumb = phonenumb;
    }

    public String getPhonenumb() {
        return phonenumb;
    }

    public void setPhonenumb(String phonenumb){
        this.phonenumb = phonenumb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    
}