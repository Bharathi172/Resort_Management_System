package resort.Swimming.Pool;

/**
 *
 * @author arvin
 */
public class SwimmingPool {
    String swimmingPoolId;
    String swimmingPoolTitle;
    Float swimmingPoolPrice;

    public String getSwimmingPoolId() {
        return swimmingPoolId;
    }

    public void setSwimmingPoolId(String swimmingPoolId) {
        this.swimmingPoolId = swimmingPoolId;
    }

    public String getSwimmingPoolTitle() {
        return swimmingPoolTitle;
    }

    public void setSwimmingPoolTitle(String swimmingPoolTitle) {
        this.swimmingPoolTitle = swimmingPoolTitle;
    }

    public Float getSwimmingPoolPrice() {
        return swimmingPoolPrice;
    }

    public void setSwimmingPoolPrice(Float swimmingPoolPrice) {
        this.swimmingPoolPrice = swimmingPoolPrice;
    }

    
    
     @Override
    public String toString(){
        return swimmingPoolTitle;
    }
    
}
