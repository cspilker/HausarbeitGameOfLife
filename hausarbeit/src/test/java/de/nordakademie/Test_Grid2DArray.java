package de.nordakademie;

import org.junit.*;

import static org.junit.Assert.*;

public class Test_Grid2DArray {

    @Test
    public void testGrid2ArrayExistance(){
        Grid2DArray grid;
        grid = new Grid2DArray(10,10);
    }

    @Test
    public void testGetWidth(){
        IGrit grid = new Grid2DArray(1,2);
        assertEquals(1, grid.getWidth());
    }

    @Test
    public void testGetHeight(1,2){
        IGrit grid = new Grid2DArray(1,2);
        assertEquals(2,grid.getHeight());

    }


}
