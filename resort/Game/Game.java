package resort.Game;

/**
 *
 * @author arvin
 */
public class Game {
    String gameId;
    String gameGenre;
    String gameTitle;
    Float cost;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
    
    
    @Override
    public String toString(){
        return gameTitle;
    }
    
    
}
