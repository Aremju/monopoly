package view;

import javax.swing.*;
import java.awt.*;

public class GameBoardGUI extends JPanel {
    private final int X_COORDINATE = 0;
    private final int Y_COORDINATE = 0;
    private final int WIDTH;
    private final int HEIGHT;

    /**
     * Sets the GameBoard to the given location
     */
    public GameBoardGUI() {
        this.HEIGHT = 600;
        this.WIDTH = 450;
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.setBounds(X_COORDINATE,Y_COORDINATE,WIDTH,HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g) {
        drawPlayingFieldBackground(g.create());
        drawBlackFieldSurrounding(g.create());
        drawEventFields(g.create());
    }


    private void drawPlayingFieldBackground(Graphics g) {
        //light green Color for the Background
        g.setColor(new Color(158,248,199));
        //Coordinates for Outer Square
        int [] xCoordinates = {10,10,449,449};
        int [] yCoordinates = {10,450,450,10};
        int amount = 4;
        g.fillPolygon(xCoordinates,yCoordinates,4);
    }

    private void drawEventFields(Graphics g) {
        g.setColor(Color.BLACK);
        //Event Fields upside
        g.drawLine(85,10,85,85);
        g.drawLine(121,10,121,85);
        g.drawLine(157,10,157,85);
        g.drawLine(193,10,193,85);
        g.drawLine(229,10,229,85);
        g.drawLine(265,10,265,85);
        g.drawLine(301,10,301,85);
        g.drawLine(337,10,337,85);
        g.drawLine(373,10,373,85);
        //Event Fields Downside

    }

    /**
     *
     *
     * @param g
     */
    private void drawBlackFieldSurrounding(Graphics g) {
        drawBlackOuterSquare(g.create());
        drawBlackInnerSquare(g.create());
    }

    private void drawBlackInnerSquare(Graphics g) {
        g.setColor(Color.BLACK);
        int [] xCoordinates = {85,85,375,375};
        int [] yCoordinates = {85,375,375,85};
        g.drawPolygon(xCoordinates,yCoordinates,yCoordinates.length);
    }

    private void drawBlackOuterSquare(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(10,10,10,450);
        g.drawLine(10,450,449,450);
        g.drawLine(449,450,449,10);
        g.drawLine(450,10,10,10);
    }
}
