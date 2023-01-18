package model.game_components;

import model.game_components.fields.Field;
import java.util.HashMap;
import java.util.Stack;

public class Board extends HashMap<Field, Field> {
    private Stack<EventCard> eventCardStack;
    private Stack<CommunityCard> communityCardStack;

    public Board() {
        this.eventCardStack = this.setupEventCardStack();
        this.communityCardStack = this.setupCommunityCardStack();
        setupFields();
    }

    private void setupFields() {

    }

    private Stack<CommunityCard> setupCommunityCardStack() {
        return null;
    }

    private Stack<EventCard> setupEventCardStack() {
        return null;
    }

    public Stack<EventCard> getEventCardStack() {
        return eventCardStack;
    }

    public void setEventCardStack(Stack<EventCard> eventCardStack) {
        this.eventCardStack = eventCardStack;
    }

    public Stack<CommunityCard> getCommunityCardStack() {
        return communityCardStack;
    }

    public void setCommunityCardStack(Stack<CommunityCard> communityCardStack) {
        this.communityCardStack = communityCardStack;
    }
}
