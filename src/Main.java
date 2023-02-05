import java.util.HashMap;

/**
 * This class is our main-Class which initializes the Game-instance
 */
public class Main {
    /**
     * This method is our main-method to start the
     * main-thread of this program
     *
     * @param args e.g. arguments from command line
     */
    public static void main(String[] args) {
        Game g = new Game();
        g.start();
        if(g.isRestart()) {
            main(args);
        }
    }
}
