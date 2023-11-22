package th.mfu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String Cartype;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public String getCartype(){
        return Cartype;
    }
    public void setCartype(String cartype){
        this.Cartype = cartype;
    }


    
}
