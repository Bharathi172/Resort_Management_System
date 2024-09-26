package resort.RolesCD;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class FoodRequestDirectory {
    
    ArrayList<FoodRequest> foodRequestsList;
    
    public FoodRequestDirectory() {
        this.foodRequestsList = new ArrayList<FoodRequest>();
    }
    
    public ArrayList<FoodRequest> getFoodRequestsList() {
        return foodRequestsList;
    }

    public void setFoodRequestsList(ArrayList<FoodRequest> foodRequestsList) {
        this.foodRequestsList = foodRequestsList;
    }
    
    public void updateFoodRequest(FoodRequest fbr, int index) {
        this.foodRequestsList.set(index, fbr);
    }
    
}
