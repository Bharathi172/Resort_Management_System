package resort.Transportation.Booking;

/**
 *
 * @author arvin
 */
public class Transport {
    String transportId;
    String transportNumber;
    String transportName;
    String group;
    Integer NoOfSeats;
    Float rate;

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }
    

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getNoOfSeats() {
        return NoOfSeats;
    }

    public void setNoOfSeats(Integer NoOfSeats) {
        this.NoOfSeats = NoOfSeats;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
    
     @Override
    public String toString(){
        return transportNumber;
    }
}
