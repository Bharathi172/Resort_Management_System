package resort.Client.TransactionHistory;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class ClientTransactionDirectory {
    
    ArrayList<ClientTransaction> clientTransactionList;

    public ClientTransactionDirectory() {
        this.clientTransactionList = new ArrayList<ClientTransaction>();
    }
    
    public ArrayList<ClientTransaction> getClientTransactionList() {
        return clientTransactionList;
    }

    public void setClientTransactionList(ArrayList<ClientTransaction> clientTransactionList) {
        this.clientTransactionList = clientTransactionList;
    }
    
    public void addClientTransaction(ClientTransaction ct) {
        this.clientTransactionList.add(ct);
    }
    
}
