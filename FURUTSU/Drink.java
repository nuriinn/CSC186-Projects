public abstract class Drink
{
   protected int payment;
  // protected double total;
   protected int qty;
   
   //normal constructor
   public Drink(int qty,int payment)
   {
       this.qty=qty;
       this.payment=payment;
   }
    
   //mutator
   public void setDrink(int qty,int payment)
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
