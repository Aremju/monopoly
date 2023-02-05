public class Game {
    private boolean restart;
    private final IGameLoop gameLoop;
    public Game() {
        this.restart = false;
        this.gameLoop = new GUIGameLoop();
    }

    public boolean isRestart() {
        return this.restart;
    }

    public void setRestart(boolean value) {
        this.restart = value;
    }

    /**
     * Starts the Game-Loop
     */
    public void start() {
        gameLoop.loop();
    }
}
