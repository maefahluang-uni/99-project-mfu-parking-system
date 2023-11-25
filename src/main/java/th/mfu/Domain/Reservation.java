package th.mfu.Domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Reservation {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date Date;
    private 

}