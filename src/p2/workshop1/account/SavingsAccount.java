package p2.workshop1.account;

import p2.workshop1.exception.BankingException;
import p2.workshop1.exception.InsufficientFundsException;

public class SavingsAccount extends AbstractAccount
{
   public SavingsAccount(String id, Double balance)
   {
      super(id, balance);
   }

   @Override
   public void withdraw(Double amount) throws BankingException
   {
      if(getBalance()-amount>=0)
         setBalance(getBalance()-amount);
      else
         throw new InsufficientFundsException();
   }

   @Override
   public void deposit(Double amount)
   {
      setBalance(getBalance()+amount);    
   }

   @Override
   public void applyFees()
   {
   }

   @Override
   public void applyInterest()
   {
   }

   public String toString()
   {
      // StringBuilder class instead
      return "Savings: "+super.toString();
   }
}
