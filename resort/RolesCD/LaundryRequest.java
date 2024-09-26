package resort.RolesCD;

import resort.Laundry.Laundry;

/**
 *
 * @author arvin
 */
public class LaundryRequest {
    
    String userId;
    Laundry selectedLaundry;
    int clothesCount;
    String orderStatus;

    public int getClothesCount() {
        return clothesCount;
    }

    public void setClothesCount(int clothesCount) {
        this.clothesCount = clothesCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Laundry getSelectedLaundry() {
        return selectedLaundry;
    }

    public void setSelectedLaundry(Laundry selectedLaundry) {
        this.selectedLaundry = selectedLaundry;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    @Override
    public String toString() {
        return userId;
    }
    
}
