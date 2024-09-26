package resort.RolesCD;

import resort.Food.FoodItem;
import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class FoodRequest {
    
    String userId;
    ArrayList<FoodItem> foodItemDetails;
    String orderStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<FoodItem> getFoodItemDetails() {
        return foodItemDetails;
    }

    public void setFoodItemDetails(ArrayList<FoodItem> foodItemDetails) {
        this.foodItemDetails = foodItemDetails;
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
