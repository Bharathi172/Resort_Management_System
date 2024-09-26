package resort.Laundry;

/**
 *
 * @author arvin
 */
public class Laundry {
    String laundryId;
    String laundryCategory;
    Float laundryPrice;

    public String getLaundryId() {
        return laundryId;
    }

    public void setLaundryId(String laundryId) {
        this.laundryId = laundryId;
    }

    public String getLaundryCategory() {
        return laundryCategory;
    }

    public void setLaundryCategory(String laundryCategory) {
        this.laundryCategory = laundryCategory;
    }

    public Float getLaundryPrice() {
        return laundryPrice;
    }

    public void setLaundryPrice(Float laundryPrice) {
        this.laundryPrice = laundryPrice;
    }
    
    @Override
    public String toString(){
        return laundryCategory;
    }

    
    
    
}
