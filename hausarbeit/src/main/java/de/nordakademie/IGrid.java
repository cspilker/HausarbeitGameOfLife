package de.nordakademie;

public interface IGrid {

    int getWidth();

    int getHeight();

    boolean getCellStatus(int xPos, int yPos);
}
