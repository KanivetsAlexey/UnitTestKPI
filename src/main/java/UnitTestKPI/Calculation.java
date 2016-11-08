package UnitTestKPI;

/**
 * Created by Alexey on 07.11.2016
 */
public class Calculation {

    public static double getSide(int square) {
        return Math.sqrt(square);
    }

    public static double getDiagonal(double side) {
        return Math.sqrt(Math.pow(side, 2) * 2);
    }
}
