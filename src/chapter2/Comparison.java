package chapter2;

import java.util.Scanner;

/**
 * @author mohamed fawzy
 * @copyright GPL
 * @date 28/1/2016
 */
public class Comparison
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numberOne;
        int numberTwo;

        System.out.print("Enter first number: ");
        numberOne=input.nextInt();

        System.out.print("Enter second number: ");
        numberTwo=input.nextInt();

        if(numberOne==numberTwo){
            System.out.printf("%d == %d\n", numberOne, numberTwo);
        }

        if(numberOne != numberTwo){
            System.out.printf("%d != %d \n", numberOne, numberTwo);
        }

        if(numberOne < numberTwo){
            System.out.printf("%d < %d\n", numberOne, numberTwo);
        }

        if (numberOne > numberTwo){
            System.out.printf("%d > %d\n",numberOne, numberTwo);
        }

        if(numberOne <= numberTwo){
            System.out.printf("%d <= %d\n", numberOne, numberTwo);
        }

        if(numberOne >= numberTwo){
            System.out.printf("%d >= %d\n", numberOne, numberTwo);
        }
    }
}
