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

    /**
     * Google what "enum" means.
     */
    public enum BankAccountType {
        /**
         * a checking account type.
         */
        CHECKINGS,
        /**
         * a savings account type.
         */
        SAVINGS,
        /**
         * a student account type.
         */
        STUDENT,
        /**
         * a work account type.
         */
        WORKPLACE
    }

    /** the account number. */
    private int accountNumber;
    /** the bank account type. */
    public BankAccountType accountType;
    /** the account balance. */
    private double accountBalance;
    /** the owner name. */
    private String ownerName;
    /** the interest rate. */
    public double interestRate;
    /** the interest earned. */
    private double interestEarned;

    /**
     * makes a new bank account.
     * @param name name of the owner.
     * @param accountCategory type of account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        accountBalance = 0.0;
        interestRate = 0.0;
        interestEarned = 0.0;
        Bank.totalAccounts++;
        //add accountNumber somehow
    }

    /**
     * sets the account balance.
     * @param accountbalance change the balance to this.
     */
    public void setAccountBalance(final double accountbalance) {
        this.accountBalance = accountbalance;
    }
    /**
     * @return the account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * @param accountnumber sets the account number
     */
    public void setAccountNumber(final int accountnumber) {
        this.accountNumber = accountnumber;
    }
    /**
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     *
     * @param interestearned the interest earned to be set
     */
    public void setInterestEarned(final double interestearned) {
        this.interestEarned = interestearned;
    }

    /**
     *
     * @return the interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param ownername the name to be set
     */
    public void setOwnerName(final String ownername) {
        this.ownerName = ownername;
    }

    /**
     *
     * @return the owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}