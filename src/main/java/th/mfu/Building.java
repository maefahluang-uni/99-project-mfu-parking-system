package th.mfu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Building {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String namebulid;

    public String getNamebuild(){
        return namebulid;
    }
    public void setNamebuild(String namebuild){
        this.namebulid = namebulid;
    }
}