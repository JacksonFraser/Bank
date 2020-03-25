package p2.workshop1.bank;

import p2.workshop1.account.Account;
import p2.workshop1.account.CreditAccount;
import p2.workshop1.account.SavingsAccount;


public class BankFactory {

    public static Account createAccount(BankAccountType bankAccountType, String id, double balance) {

        switch (bankAccountType) {
            case SAVINGS_ACCOUNT:
                return new SavingsAccount(id, balance);
            case CREDIT_ACCOUNT:
                return new CreditAccount(id, balance);
            default:
                return null;
        }
    }
}
