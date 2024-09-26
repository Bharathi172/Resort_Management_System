package resort.RolesCD;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class GameRequestDirectory {
    
    ArrayList<GameRequest> gameRequestList;

    public GameRequestDirectory() {
        this.gameRequestList = new ArrayList<GameRequest>();
    }
    
    public ArrayList<GameRequest> getGameRequestList() {
        return gameRequestList;
    }

    public void setGameRequestList(ArrayList<GameRequest> gameRequestList) {
        this.gameRequestList = gameRequestList;
    }
    
    public void updateGameRequest(GameRequest gameWRequest, int index) {
        this.gameRequestList.set(index, gameWRequest);
    }
    
}
