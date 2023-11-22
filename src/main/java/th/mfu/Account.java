package th.mfu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String phonenumb;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getphonenumb(){
        return phonenumb;
    }
    public void setphonenumb(String phonenumb){
        this.phonenumb = phonenumb;
    }
    


}


