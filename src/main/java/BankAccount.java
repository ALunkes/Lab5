import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }
    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        accountBalance = 0.0;
        interestRate = 0.0;
        interestEarned = 0.0;
        //add accountNumber somehow
    }
    public void setAccountBalance(final double accountbalance) {
        this.accountBalance = accountbalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountNumber(final int accountnumber) {
        this.accountNumber = accountnumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setInterestEarned(final double interestearned) {
        this.interestEarned = interestearned;
    }
    public double getInterestEarned() {
        return interestEarned;
    }
    public void setOwnerName(final String ownername) {
        this.ownerName = ownername;
    }
    public String getOwnerName() {
        return ownerName;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}