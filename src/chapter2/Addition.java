package chapter2;

import java.util.Scanner;

/**
 * @author mohamed fawzy
 * @copyright GPL
 * @date 28/1/2016
 */
public class Addition
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        System.out.print("Enter first number: "); // prompt
        number1=input.nextInt(); // read first number from user
        System.out.print("Enter second number: "); // prompt
        number2=input.nextInt(); // read second number from user
        sum=number1+number2;
        System.out.printf("Sum is %d\n", sum);; // display sum
    } // end method
} // end class addition
