package UnitTestKPI;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static void main( String[] args ){
        int square = HandleSquare.getAndCheckSquare();
        HandleSquare.calcSquare(square);
    }
}
