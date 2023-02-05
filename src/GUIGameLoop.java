import javax.swing.*;
public class GUIGameLoop extends JFrame implements IGameLoop {
    /**
     * Starts the GUI-GameLoop which initializes all
     * JFrame-Components including some JFrame-Operations
     * and also initializes the View-Types
     */
    public GUIGameLoop() {
        this.setTitle("MyMonopoly:)");
        this.setSize(900,600);
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

    }

    @Override
    public void loop() {
        setVisible(true);
    }
}
