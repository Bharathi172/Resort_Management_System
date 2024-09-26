package resort.RolesCD;

import resort.Swimming.Pool.SwimmingPool;
import java.util.Date;

/**
 *
 * @author arvin
 */
public class PoolRequest {
    
    String userId;
    SwimmingPool selectedPool;
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

    public SwimmingPool getSelectedPool() {
        return selectedPool;
    }

    public void setSelectedPool(SwimmingPool selectedPool) {
        this.selectedPool = selectedPool;
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
