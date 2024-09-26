package resort.RolesCD;

import resort.Transportation.Booking.Transport;
import resort.User.User;
import java.util.Date;

/**
 *
 * @author arvin
 */
public class TransportRequest {

    String userId;
    Transport selectedVehicle;
    int durationInHours;
    Date reservationDate;
    String bookingStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Transport getSelectedVehicle() {
        return selectedVehicle;
    }

    public void setSelectedVehicle(Transport selectedVehicle) {
        this.selectedVehicle = selectedVehicle;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
    
     @Override
    public String toString() {
        return userId;
    }

}
