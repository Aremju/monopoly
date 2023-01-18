package model;

import javax.swing.*;
import java.awt.*;

public class GUIGameLoop extends JFrame implements IGameLoop {
    /**
     * Creates the GameLoop for the GUI, extending from JFrame
     */
    public GUIGameLoop() {
        super("Monopoly");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width / 2, screenSize.height / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        placeIntoMiddle(screenSize);
    }

    private void placeIntoMiddle(Dimension screenSize) {
        this.setLocation(screenSize.width/2-this.getSize().width/2,
                screenSize.height/2-this.getSize().height/2);
    }

    @Override
    public void gameLoop() {
        setVisible(true);
    }
}
