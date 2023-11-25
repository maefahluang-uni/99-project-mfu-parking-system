package th.mfu.Domain;


import javax.persistence.Entity;



@Entity
public class StaffStudent {
 
    private int id;
    private String phonenumb;


    public StaffStudent(String phonenumb) {
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