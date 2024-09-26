package resort.Swimming.Pool;

import resort.Transportation.Booking.Transport;
import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class SwimmingPoolDirectory {
    ArrayList<SwimmingPool> poolDirectory;
    
    public SwimmingPoolDirectory(){
        this.poolDirectory = new ArrayList<>();
    }

    public ArrayList<SwimmingPool> getPoolDirectory() {
        return poolDirectory;
    }

    public void setPoolDirectory(ArrayList<SwimmingPool> poolDirectory) {
        this.poolDirectory = poolDirectory;
    }
    
    public SwimmingPool getPools(int index){
        SwimmingPool newPool = new SwimmingPool();
        newPool = poolDirectory.get(index);
        return newPool;
    }
    
    public SwimmingPool addPoolDetails(){
        SwimmingPool newPool = new SwimmingPool();
        poolDirectory.add(newPool);
        
        return newPool;
    }
    
    public SwimmingPool getPoolByName(String poolName) {
        
        SwimmingPool selectedPool = new SwimmingPool();
        for(SwimmingPool pool : poolDirectory) {
            if(pool.getSwimmingPoolTitle().equals(poolName)) {
                selectedPool = pool;
                break;
            }
        }
        return selectedPool;
    }
    
    public void deletePool(SwimmingPool pool){
        poolDirectory.remove(pool);
    }
    
}
