package resort.RolesCD;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class TransportRequestDirectory {
    
    ArrayList<TransportRequest> TransportRequestList;

    public TransportRequestDirectory() {
        this.TransportRequestList = new ArrayList<TransportRequest>();
    }
    
    public ArrayList<TransportRequest> getTransportRequestList() {
        return TransportRequestList;
    }

    public void setTransportRequestList(ArrayList<TransportRequest> TransportRequestList) {
        this.TransportRequestList = TransportRequestList;
    }
    
     public void updateTransportRequest(TransportRequest TransportWRequest, int index) {
        this.TransportRequestList.set(index, TransportWRequest);
    }
    
}
