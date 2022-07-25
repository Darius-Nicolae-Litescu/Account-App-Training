import java.io.Serializable;

public class Account implements Serializable {
    private final int MINIMUM_BALANCE_AMOUNT = 5000;
    private final int CASHBACK_PROCENT = 1;
    private long accountNumber;
    private String username;
    private String password;
    private int balance;
    private KYCVerification kycDetails;
    private ContactDetails contactDetails;
    private int cashBack;

    public Account(long accountNumber, String username, String password, int balance, KYCVerification kycDetails, ContactDetails contactDetails, int cashBack) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.kycDetails = kycDetails;
        this.contactDetails = contactDetails;
        this.cashBack = cashBack;
    }

    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int withdrawal(int amount) {
        int amountRemainingAfterPossibleWithdrawal = this.balance + this.cashBack - amount;
        if (amountRemainingAfterPossibleWithdrawal >= MINIMUM_BALANCE_AMOUNT) {
            if (this.balance - amount >= 0) {
                this.balance = this.balance - amount;
            } else {
                int rest = Math.abs(this.balance - amount);
                this.cashBack = this.cashBack - rest;
            }
            this.cashBack += AccountUtils.getPercentageFromNumber(amount, CASHBACK_PROCENT);
            return this.balance + this.cashBack;
        }
        System.out.println("\nCannot withdraw more than total account balance (Total balance + cashback) or");
        System.out.println("User has to maintain " + MINIMUM_BALANCE_AMOUNT + " limit\n");
        return -1;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public KYCVerification getKycDetails() {
        return kycDetails;
    }

    public void setKycDetails(KYCVerification kycDetails) {
        this.kycDetails = kycDetails;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public int getCashBack() {
        return cashBack;
    }

    public void setCashBack(int cashBack) {
        this.cashBack = cashBack;
    }
}
