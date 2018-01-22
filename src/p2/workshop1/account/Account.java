package p2.workshop1.account;

import p2.workshop1.exception.BankingException;

public interface Account
{
   public abstract void withdraw(Double amount) throws BankingException;
   public abstract void deposit(Double amount);
   public abstract String getId();
   public abstract void applyFees();
   public abstract void applyInterest();
}
