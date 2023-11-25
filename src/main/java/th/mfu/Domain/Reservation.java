package th.mfu.Domain;

import java.util.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reserid;
    private Date date;
    private Time starttime;
    private Time endtime;
    private String building;


    public Reservation() {

    }

  

    public int getReserId() {
        return reserid;
    }

    public void setReserId(int reserid) {
        this.reserid = reserid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return starttime;
    }

    public void setStartTime(Time startTime) {
        this.starttime = startTime;
    }

    public Time getEndTime() {
        return endtime;
    }

    public void setEndTime(Time endTime) {
        this.endtime = endTime;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

}
