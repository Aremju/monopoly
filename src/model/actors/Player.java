package model.actors;

import java.util.Random;
import java.util.logging.Logger;

public class Player {
    private static final Logger LOG = Logger.getLogger(Player.class.getSimpleName());
    private static final int DICE_MAX = 6;
    private String name;
    private int balance;
    private static int playerCount = 0;
    private int roundBreak;

    public Player (String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.roundBreak = 0;
        playerCount++;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int rollDice() {
        Random random = new Random();
        return (random.nextInt(DICE_MAX) + 1) + (random.nextInt(DICE_MAX) + 1);
    }


    public int getRoundBreak() {
        return roundBreak;
    }

    public void setRoundBreak(int roundBreak) {
        this.roundBreak = roundBreak;
    }
}
