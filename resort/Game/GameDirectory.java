package resort.Game;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class GameDirectory {

    ArrayList<Game> gameDirectoryList;

    public GameDirectory() {
        this.gameDirectoryList = new ArrayList<>();
    }

    public ArrayList<Game> getGameDirectoryList() {
        return gameDirectoryList;
    }

    public void setGameDirectoryList(ArrayList<Game> gameDirectoryList) {
        this.gameDirectoryList = gameDirectoryList;
    }
    
     public Game getGames(int index){
        Game newGame = new Game();
        newGame = gameDirectoryList.get(index);
        return newGame;
    }
    
    public Game addGameDetails(){
        Game newGame = new Game();
        gameDirectoryList.add(newGame);
        
        return newGame;
    }

    public Game getGameByName(String gameName) {

        Game selectedGame = new Game();
        for (Game game : gameDirectoryList) {
            if (game.getGameTitle().equals(gameName)) {
                selectedGame = game;
                break;
            }
        }
        return selectedGame;
    }
    
    public void gameToDelete(Game game){
        gameDirectoryList.remove(game);
    }

}
