package FlightAggrigatorProject;

import java.util.Date;

public class FlightData {
    private String src;
    private String dest;
    private Date jdate;
    private String type;
    private int id;
    private int cost;

    public FlightData(String src, String dest, Date jdate, String type, int id, int cost) {
        this.src = src;
        this.dest = dest;
        this.jdate = jdate;
        this.type = type;
        this.id = id;
        this.cost = cost;
    }

    public Date getJdate() {
        return jdate;
    }

    public void setJdate(Date jdate) {
        this.jdate = jdate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "FlightData {" +
                "src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                ", jdate=" + jdate +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                '}'+"\n";
    }
}
