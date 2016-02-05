package chapter3;

import java.util.Scanner;

/**
 * @author mohamed fawzy
 * @copyright GPL
 */
public class AccountTest
{

    public static void main(String[] args)
    {
        // init object
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        // print objects balance
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
        //create scanner to read user input
        Scanner input = new Scanner(System.in);
        double depositAmount; // deposite amount read from user
        System.out.print("Enter deposit amount for account 1: ");
        depositAmount=input.nextDouble();
        System.out.printf("\nadding %.2f to account1 balance\n\n",depositAmount);
        account1.credit(depositAmount);
        // display message
        System.out.printf("account1 balance $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance $%.2f\n", account2.getBalance());
        // prompt
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
        account2.credit(depositAmount);
        //display balance
        System.out.printf("account1 balance $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance $%.2f\n",account2.getBalance());
    }
}
