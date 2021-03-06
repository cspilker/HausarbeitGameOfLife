package de.nordakademie;

import org.junit.*;

import static org.junit.Assert.*;

public class Test_Grid2DArray {

    @Test
    public void testGrid2ArrayExistance(){
        Grid2DArray grid;
        int[][] aliveCells = {};
        grid = new Grid2DArray(10,10, aliveCells);
    }

    @Test
    public void testGetWidth(){
        int[][] aliveCells = {};
        IGrid grid = new Grid2DArray(1,2, aliveCells);
        assertEquals(1, grid.getWidth());
    }

    @Test
    public void testGetHeight(){
        int[][] aliveCells = {};
        IGrid grid = new Grid2DArray(1,2, aliveCells);
        assertEquals(2,grid.getHeight());
    }

    @Test
    public void testGetCellStatus(){
        int[][] cellsIsAlive = {{1,1}};
        IGrid grid_isAlive = new Grid2DArray(1,2, cellsIsAlive);
        assertTrue(grid_isAlive.getCellStatus(1,1));

        IGrid grid_isDead = new Grid2DArray(1,2, cellsIsAlive);
        assertFalse(grid_isDead.getCellStatus(1,2));
    }

    @Test
    public void testGetCellStatusArrayBorders(){
        int[][] cellsIsAlive = {{1,1}, {2,2}};
        IGrid grid = new Grid2DArray(2,2,cellsIsAlive);
        assertEquals(null, grid.getCellStatus(0,0));
        assertEquals(null, grid.getCellStatus(0,2));
        assertEquals(null, grid.getCellStatus(2,0));
        assertEquals(null, grid.getCellStatus(2,-1));
        assertEquals(null, grid.getCellStatus(-2,-2));
        assertEquals(null, grid.getCellStatus(3,3));
    }


}
