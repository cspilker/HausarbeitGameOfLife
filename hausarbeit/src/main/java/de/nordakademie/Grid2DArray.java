package de.nordakademie;

public class Grid2DArray extends Grid{

    private boolean[][] gridArray;

    public Grid2DArray(int width, int height, int[][] aliveCells) {
    super(width, height);
    gridArray = new boolean[width][height];
        //gridArray[0][0]=true;

        for (int i=0; i<aliveCells.length; i++) {
            setCellStatus(aliveCells[i][0],aliveCells[i][1], true);
        }
    }

    private void setCellStatus(int xPos, int yPos, boolean status) {
        gridArray[xPos-1][yPos-1]=status;
    }

    public boolean getCellStatus(int xPos, int yPos) {
        return gridArray[xPos-1][yPos-1];
    }
}
