public class Game {
    private boolean restart;
    private IGameLoop gameLoop;
    public Game() {
        this.restart = false;
        this.gameLoop = new GUIGameLoop();
    }

    public boolean isRestart() {
        return this.restart;
    }

    public void start() {
        gameLoop.loop();
    }
}
