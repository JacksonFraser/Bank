package p2.workshop1.test;

import p2.workshop1.account.Account;
import p2.workshop1.account.CreditAccount;
import p2.workshop1.account.SavingsAccount;
import p2.workshop1.bank.Bank;
import p2.workshop1.bank.BankAccountType;
import p2.workshop1.bank.BankFactory;
import p2.workshop1.bank.Customer;
import p2.workshop1.exception.BankingException;
import p2.workshop1.exception.InsufficientCreditException;
import p2.workshop1.exception.InsufficientFundsException;

public class TestBank
{

   public TestBank()
   {
      Bank bank=new Bank();
      Customer customer1 = new Customer("joe", "1/1/2000", "customer1");
      Customer customer2 = new Customer("jill", "1/1/1998", "customer2");
      bank.addCustomer(customer1);
      bank.addCustomer(customer2);


      Account savings = BankFactory.createAccount(BankAccountType.SAVINGS_ACCOUNT,"1",0.0);
      Account credit = BankFactory.createAccount(BankAccountType.CREDIT_ACCOUNT,"2",0.0);
      
      customer1.addAccount(savings);
      customer1.addAccount(credit);
      
      try
      {
         savings.deposit(1000.0);
         savings.withdraw(500.0);
         credit.withdraw(1000.0);
         credit.deposit(500.0);
      }
      catch (InsufficientFundsException ef)
      {
         System.out.println("insufficient funds");
      }
      catch (InsufficientCreditException ec)
      {
         System.out.println("insufficient credit");
      }
      catch (BankingException ex)
      {
         // should not be reachable with current classes
         System.out.println("banking exception");
      }   
      
      customer1.listAccounts();
      customer2.listAccounts();

   }

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      new TestBank();
   }

}
