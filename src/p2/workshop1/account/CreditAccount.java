package p2.workshop1.account;

import p2.workshop1.exception.BankingException;
import p2.workshop1.exception.InsufficientCreditException;

public class CreditAccount extends AbstractAccount
{
   private static final Double CREDIT_LIMIT=5000.0;
   
   public CreditAccount(String id, Double balance)
   {
      super(id, balance);
   }

   @Override
   public void withdraw(Double amount) throws BankingException
   {
      if(getBalance()+amount<=CREDIT_LIMIT)
         setBalance(getBalance()+amount);
      else
         throw new InsufficientCreditException();      
   }

   @Override
   public void deposit(Double amount)
   {
      setBalance(getBalance()-amount);
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
      return "Credit: "+super.toString();
   }
}
