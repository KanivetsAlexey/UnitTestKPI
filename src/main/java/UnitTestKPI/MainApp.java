package UnitTestKPI;

/**
 * Find side of Square and diagonal
 *
 */
public class MainApp
{
    public static void main( String[] args ){
        int square = HandleSquare.getAndCheckSquare();
        HandleSquare.calcSquare(square);
    }
}
