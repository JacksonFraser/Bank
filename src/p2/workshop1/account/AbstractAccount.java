package p2.workshop1.account;

public abstract class AbstractAccount implements Account
{
   private String id;
   private Double balance;
    
   protected void setBalance(Double balance)
   {
      this.balance = balance;
   }

   public AbstractAccount(String id, Double balance)
   {
      super();
      this.id = id;
      this.balance = balance;
   }

   public String getId()
   {
      return id;
   }

   public Double getBalance()
   {
      return balance;
   }

   public String toString()
   {
      // StringBuilder class instead
      return super.toString()+": "+", account id: " + getId() + ", balance="+getBalance();
   }
}
