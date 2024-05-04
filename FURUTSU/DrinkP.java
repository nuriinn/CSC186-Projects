public abstract class DrinkP
{
   protected int payment;
  // protected double total;
   protected int qty;
   
   //normal constructor
   public DrinkP(int qty,int payment)
   {
       this.qty=qty;
       this.payment=payment;
   }
    
   //mutator
   public void setDrinkP(int qty,int payment)
   {
       this.qty=qty;
       this.payment=payment;
   }
   
   //accessor
   public int getPayment() {return payment;}
   public int getQty() {return qty;}
   
   public String toString()
   {
       return ( "\nPayment: " +payment+ "\nQuantity: "+qty);
   }
   
   public abstract double calculateTotal();
   
}
