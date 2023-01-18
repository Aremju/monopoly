package model.game_components.fields;

import model.actors.Player;
import java.util.ArrayList;

public abstract class Field {
    private ArrayList<Player> playersOnField;
    private Field nextField;

    public Field (Field nextField) {
        this.nextField = nextField;
        this.playersOnField = new ArrayList<>();
    }

    public abstract void placePlayerOnField(Player player);

    public ArrayList<Player> getPlayersOnField() {
        return playersOnField;
    }

    public void setPlayersOnField(ArrayList<Player> playersOnField) {
        this.playersOnField = playersOnField;
    }

    public Field getNextField() {
        return nextField;
    }

    public void setNextField(Field nextField) {
        this.nextField = nextField;
    }
}
