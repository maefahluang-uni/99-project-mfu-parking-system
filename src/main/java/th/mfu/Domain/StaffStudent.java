package th.mfu.Domain;


import javax.persistence.Entity;



@Entity
public class StaffStudent {
 
    private int Staffid;
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

    public int getStaffId() {
        return Staffid;
    }

    public void setId(int Staffid){
        this.Staffid = Staffid;
    }

}