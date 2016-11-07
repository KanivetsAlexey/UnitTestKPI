package UnitTestKPI;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Alexey on 07.11.2016
 */
public class CalculationTest {

    @Test
    public void getSideTest(){
        double side = Calculation.getSide(25);
        assertEquals(5.0, side);
    }

    @Test
    public void getDiagonalTest(){
        double diagonal = Calculation.getDiagonal(5.0);
        assertEquals(Math.sqrt(50.0), diagonal);
    }
}
