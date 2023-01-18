package model.game_components.fields;

import model.actors.Player;

public class StreetField extends Field {
    private String name;
    private int rent;
    private int mortgageValue;


    public StreetField(String name, int rent, int mortgageValue) {
        super(null);
        this.name = name;
        this.rent = rent;
        this.mortgageValue = mortgageValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getMortgageValue() {
        return mortgageValue;
    }

    public void setMortgageValue(int mortgageValue) {
        this.mortgageValue = mortgageValue;
    }

    @Override
    public void placePlayerOnField(Player player) {

    }
}
