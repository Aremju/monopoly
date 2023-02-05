import javax.swing.*;
import java.awt.*;

public class GUIGameLoop extends JFrame implements IGameLoop {
    private final int GUI_WIDTH = 900;
    private final int GUI_HEIGHT = 600;
    /**
     * Starts the GUI-GameLoop which initializes all
     * JFrame-Components including some JFrame-Operations
     * and also initializes the View-Types
     */
    public GUIGameLoop() {
        this.setTitle("MyMonopoly:)");
        this.setSize(GUI_WIDTH,GUI_HEIGHT);
        this.setCentered();
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Sets the JFrame into the centered
     * Position according to the Desktop-Device
     * the user uses
     */
    private void setCentered() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int xCoordinate = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
        int yCoordinate = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
        this.setLocation(xCoordinate, yCoordinate);
    }

    @Override
    public void loop() {
        setVisible(true);
    }
}
