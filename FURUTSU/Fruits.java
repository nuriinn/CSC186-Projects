public class Fruits extends Drink
{
    private int code;
    private String condiments;
    
    //normal constructor
    public Fruits(int code, String condiments, int qty, int payment)
    {
        super(qty,payment);
        this.code=code;
        this.condiments=condiments;
    }
    
    //getter method
    public int getCode(){return code;}
    public String getCondiments(){return condiments;}

    
    //setter method
    public void setCode(int code){this.code=code;}
    public void setCondiments(String condiments){this.condiments=condiments;}
    
    public String addOrderFruit()
    {
        if(code == 1)
           return "Strawberry";
        else if(code == 2)
           return "Guava";
        else if(code == 3)
           return "Watermelon";
        else if(code == 4)
           return "Mango";
        else if(code == 5)
           return "Grape";
        else 
           return "Unknown";
    }
    
    //condiments
    public double addCondiments()
    {
        double extraCharge = 0;
        if(condiments.equalsIgnoreCase("Y"))
            extraCharge = 2.00;
        else if(condiments.equalsIgnoreCase("N"))
            extraCharge = 0.00;
        return extraCharge;
    }
    
    public double calculateTotal()
    {
        double fruitPrice = 0;
        
        if(code == 1)
            fruitPrice = 6.00;
        else if(code == 2)
            fruitPrice = 4.00;
        else if(code == 3)
            fruitPrice = 5.00;
        else if(code == 4)
            fruitPrice = 5.00;
        else if(code == 5)
            fruitPrice = 6.00;
        else
            fruitPrice = 0;
        
        double extraCharge = addCondiments();
        double total = (fruitPrice + extraCharge) * qty;
        return total;
    }    
    
    public String toString()
    {
        return("\nCode: " +code+ "\nCondiment: "+condiments);
    }
    
}

