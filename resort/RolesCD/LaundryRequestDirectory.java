package resort.RolesCD;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class LaundryRequestDirectory {
    
    ArrayList<LaundryRequest> laundryRequestList;

    public LaundryRequestDirectory() {
        this.laundryRequestList = new ArrayList<LaundryRequest>();
    }
    
    public ArrayList<LaundryRequest> getLaundryRequestList() {
        return laundryRequestList;
    }

    public void setLaundryRequestList(ArrayList<LaundryRequest> laundryRequestList) {
        this.laundryRequestList = laundryRequestList;
    }
    
    public void updateLaundryRequest(LaundryRequest laundryWRequest, int index) {
        this.laundryRequestList.set(index, laundryWRequest);
    }
    
}
