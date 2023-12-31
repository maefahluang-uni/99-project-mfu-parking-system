package th.mfu.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Visitor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int visitorid;

    @Column(name="phonenumb")
    private String phonenumb;

    

    public Visitor(){

    }



    public int getVisitorid() {
        return visitorid;
    }



    public void setVisitorid(int visitorid) {
        this.visitorid = visitorid;
    }



    public String getPhonenumb() {
        return phonenumb;
    }



    public void setPhonenumb(String phonenumb) {
        this.phonenumb = phonenumb;
    }

    

}