package view;

import javax.swing.*;

public class GameView extends JPanel {
    private GameBoardGUI gameBoardGUI;

    public GameView () {
        this.setLayout(null);
        setBounds(0,0,900,600);
        this.gameBoardGUI = new GameBoardGUI();
        add(gameBoardGUI);
    }
}