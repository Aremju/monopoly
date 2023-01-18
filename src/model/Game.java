package model;

import model.actors.Player;
import model.game_components.Board;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static final Game game = new Game(new GUIGameLoop());
    private final IGameLoop gameLoopType;
    private List<Player> allPlayers;
    private Board gameBoard;
    /**
     * Hello World to GUI
     */
    private Game(IGameLoop gameLoopType) {
        this.gameLoopType = gameLoopType;
        this.allPlayers = new ArrayList<>();
        this.gameBoard = new Board();
    }

    public void gameSetup() {

    }



    public static Game getInstance() {
        return game;
    }

    public void run() {
        gameLoopType.gameLoop();
    }



}
