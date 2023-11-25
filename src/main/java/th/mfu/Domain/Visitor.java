package th.mfu.Domain;


import javax.persistence.Entity;



@Entity
public class Visitor {
 
    private int visitorid;
    private String phonenumb;


    public Visitor(String phonenumb) {
        this.phonenumb = phonenumb;
    }

    public String getPhonenumb() {
        return phonenumb;
    }

    public void setPhonenumb(String phonenumb){
        this.phonenumb = phonenumb;
    }

    public int getId() {
        return visitorid;
    }

    public void setId(int visitorid){
        this.visitorid = visitorid;
    }

}