package resort.RolesCD;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class PoolRequestDirectory {
    
    ArrayList<PoolRequest> poolRequestList;

    public PoolRequestDirectory() {
        this.poolRequestList = new ArrayList<PoolRequest>();
    }
    
    public ArrayList<PoolRequest> getPoolRequestList() {
        return poolRequestList;
    }

    public void setPoolRequestList(ArrayList<PoolRequest> poolRequestList) {
        this.poolRequestList = poolRequestList;
    }
    
     public void updatePoolRequest(PoolRequest poolWRequest, int index) {
        this.poolRequestList.set(index, poolWRequest);
    }
    
}
