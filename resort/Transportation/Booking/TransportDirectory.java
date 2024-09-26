package resort.Transportation.Booking;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class TransportDirectory {
   private ArrayList<Transport> transportdirectory;
   
   public TransportDirectory(){
        this.transportdirectory = new ArrayList<>();
    }

    public ArrayList<Transport> getTransportdirectory() {
        return transportdirectory;
    }

    public void setTransportdirectory(ArrayList<Transport> transportdirectory) {
        this.transportdirectory = transportdirectory;
    }
    
    public Transport getTransport(int index){
        Transport newVehicle = new Transport();
        newVehicle = transportdirectory.get(index);
        return newVehicle;
    }
    
    public Transport addTransportDetails(){
        Transport newVehicle = new Transport();
        transportdirectory.add(newVehicle);
        
        return newVehicle;
    }
    
    public Transport getTransportByName(String vehicleName) {
        
        Transport selectedVehicle = new Transport();
        for(Transport vehicle : transportdirectory) {
            if(vehicle.getTransportName().equals(vehicleName)) {
                selectedVehicle = vehicle;
                break;
            }
        }
        return selectedVehicle;
    }
    
    public void deleteTransport(Transport vehicle){
        transportdirectory.remove(vehicle);
    }
   
}
