package resort.Food;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class FoodItemDirectory {
    private ArrayList<FoodItem> FoodItemDirectoryList;
    
    public FoodItemDirectory() {
        this.FoodItemDirectoryList = new ArrayList<>();
    }

    public ArrayList<FoodItem> getFoodItemDirectoryList() {
        return FoodItemDirectoryList;
    }

    public void setFoodItemDirectoryList(ArrayList<FoodItem> FoodItemDirectoryList) {
        this.FoodItemDirectoryList = FoodItemDirectoryList;
    }
    
    public void addNewFoodItem(FoodItem fm) {
        this.FoodItemDirectoryList.add(fm);
    }
    
    public void deleteFoodItem(FoodItem fm) {
        this.FoodItemDirectoryList.remove(fm);
    }
    
    public void updateExistingFoodItem(FoodItem fm, int index) {
        this.FoodItemDirectoryList.set(index, fm);
    }
    
    public FoodItem getFoodItemByName(String itemName) {

        FoodItem selectedItem = new FoodItem();
        for (FoodItem item : FoodItemDirectoryList) {
            if (item.getFoodItemName().equals(itemName)) {
                selectedItem = item;
                break;
            }
        }
        return selectedItem;
    }
}
