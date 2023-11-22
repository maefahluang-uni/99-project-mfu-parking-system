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
    
    // Constructors, getters, and setters

    public Vehicle() {
        // Default constructor
    }

    public Vehicle(String Cartype) {
        this.Cartype = Cartype;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCartype() {
        return Cartype;
    }

    public void setCartype(String Cartype) {
        this.Cartype = Cartype;
    }
}
