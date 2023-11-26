package th.mfu.Domain;
import javax.persistence.Entity;

@Entity
public class Building {
    private int buildid;
    private String buildname;
    private Boolean available;

  

    public Building() {

    }

    public Building(int buildid, String buildname, Boolean available) {
        this.buildid = buildid;
        this.buildname = buildname;
        this.available = available;
    }

  

    public int getBuildId() {
        return buildid;
    }

    public void setBuildId(int buildid) {
        this.buildid = buildid;
    }

    public String getBuildName() {
        return buildname;
    }

    public void setBuildName(String buildname) {
        this.buildname = buildname;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }


}
