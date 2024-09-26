package resort;

import resort.Food.FoodItemDirectory;
import resort.Laundry.LaundryDirectory;
import resort.HouseKeeping.HouseKeepingScheduleDirectory;
import resort.Game.GameDirectory;
import resort.Swimming.Pool.SwimmingPoolDirectory;
import resort.Client.TransactionHistory.ClientTransactionDirectory;
import resort.Transportation.Booking.TransportDirectory;
import resort.User.UserDirectory;
import resort.RolesCD.FoodRequestDirectory;
import resort.RolesCD.GameRequestDirectory;
import resort.RolesCD.LaundryRequestDirectory;
import resort.RolesCD.PoolRequestDirectory;
import resort.RolesCD.TransportRequestDirectory;

/**
 *
 * @author arvin
 */
public class EcoSystem {

    private static EcoSystem ecoSystem;
    UserDirectory userDirectory;
    TransportDirectory transportDirectory;
    SwimmingPoolDirectory poolDirectory;
    GameDirectory gameDirectory;
    LaundryDirectory laundryDirectory;
    FoodItemDirectory foodItemDirectory;
    FoodRequestDirectory foodRequestDirectory;
    GameRequestDirectory gameRequestDirectory;
    LaundryRequestDirectory laundryRequestDirectory;
    PoolRequestDirectory poolRequestDirectory;
    TransportRequestDirectory transportRequestDirectory;
    ClientTransactionDirectory clientTransactionDirectory;
    HouseKeepingScheduleDirectory houseKeepingScheduleDirectory;

    private EcoSystem() {

             try {
            // Initialize directories
            userDirectory = new UserDirectory();
            transportDirectory = new TransportDirectory();
            poolDirectory = new SwimmingPoolDirectory();
            gameDirectory = new GameDirectory();
            laundryDirectory = new LaundryDirectory();
            foodItemDirectory = new FoodItemDirectory();
            foodRequestDirectory = new FoodRequestDirectory();
            gameRequestDirectory = new GameRequestDirectory();
            laundryRequestDirectory = new LaundryRequestDirectory();
            poolRequestDirectory = new PoolRequestDirectory();
            transportRequestDirectory = new TransportRequestDirectory();
            clientTransactionDirectory = new ClientTransactionDirectory();
            houseKeepingScheduleDirectory = new HouseKeepingScheduleDirectory();
        } catch (Exception e) {
            // Handle or log the exception
            e.printStackTrace();
        }
        
    }
    
    public static synchronized EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public TransportDirectory getTransportDirectory() {
        return transportDirectory;
    }


    public SwimmingPoolDirectory getPoolDirectory() {
        if (poolDirectory == null) {
            poolDirectory = new SwimmingPoolDirectory();
        }
        return poolDirectory;
    }

    public GameDirectory getGameDirectory() {
        return gameDirectory;
    }

    public LaundryDirectory getLaundryDirectory() {
        return laundryDirectory;
    }

    public FoodItemDirectory getFBItemDirectory() {
        return foodItemDirectory;
    }

    public HouseKeepingScheduleDirectory getHouseKeepingScheduleDirectory() {
        return houseKeepingScheduleDirectory;
    }

    public FoodRequestDirectory getFoodRequestDirectory() {
        return foodRequestDirectory;
    }

    public GameRequestDirectory getGameRequestDirectory() {
        return gameRequestDirectory;
    }

    public LaundryRequestDirectory getLaundryRequestDirectory() {
        return laundryRequestDirectory;
    }

    public PoolRequestDirectory getPoolRequestDirectory() {
        return poolRequestDirectory;
    }

    public TransportRequestDirectory getTransportRequestDirectory() {
        return transportRequestDirectory;
    }

    public ClientTransactionDirectory getClientTransactionDirectory() {
        return clientTransactionDirectory;
    }

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }
}
