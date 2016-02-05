package chapter3;

/**
 * @author Mohamed fawzy
 * @copyright GPL
 */
public class Account
{
    private double balance;

    /**
     * constructor for initial account balance
     * @param initialBalance
     */
    public Account(double initialBalance)
    {
        if(initialBalance > 0.0){
            balance = initialBalance;
        }
    }

    /**
     * credit add an amount to the account
     * @param amount
     */
    public void credit(double amount)
    {
        balance = balance+amount; // add amount to balance
    }

    /**
     *
     * @return double
     */
    public double getBalance()
    {
        return balance;
    }
}
