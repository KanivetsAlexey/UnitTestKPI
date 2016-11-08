package UnitTestKPI;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alexey on 07.11.2016
 */
public class HandleSquare {

    public static int getAndCheckSquare(){
        System.out.println("Write square int value");
        int square = 0;
        while(true) try {
            Scanner scanner = new Scanner(System.in);
            square = scanner.nextInt();
            if (square <= 0) {
                System.out.println("Write value > 0");
            } else {
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Write int value");
        }
        return square;
    }

    public static void calcSquare(int square){
        if(square > 0){
            double side = Calculation.getSide(square);
            double diagonal = Calculation.getDiagonal(side);
            int sideBigSquare = (int) Math.round(diagonal);
            System.out.println("Side of the SMALL square =" + side);
            System.out.println("Side of the BIG square =" + sideBigSquare);
        } else {
            System.out.println("Square is not defined");
        }
    }


}
