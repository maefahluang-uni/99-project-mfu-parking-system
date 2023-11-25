package th.mfu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
public class Building {

    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String namebulid;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNamebuild(){
        return namebulid;
    }
    public void setNamebuild(String namebuild){
        this.namebulid = namebulid;
    }
}
