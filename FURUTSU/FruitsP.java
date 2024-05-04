public class FruitsP extends DrinkP
{
    private int code;
    private String condiments;
    
    //normal constructor
    public FruitsP(int code, String condiments,int qty,int payment)
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
    
    //Fruit Selection
    public void addOrderFruit(int code)
    {
        
        if(code == 1 || code == 2 || code == 3 || code == 4 || code == 5)
           code=code;
    }
    
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
    
    //Condiments
    public double addCondiments()
    {
        double extraCharge = 0;
        if(condiments == "Y")
           extraCharge = 1.00;
        else if(condiments == "N")
           extraCharge = 0.00;
        return extraCharge;
    }
    
    public double calculateTotal()
    {
        double fruitPrice=0;
        
        if (code == 1)
            fruitPrice = 6.00;
        else if (code == 2)
            fruitPrice = 4.00;
        else if (code == 3)
            fruitPrice =  5.00;
        else if (code == 4)
            fruitPrice =  5.00;
        else if (code == 5)
            fruitPrice =  6.00;
        else 
            fruitPrice = 0;
        
        double total = fruitPrice*qty ;
        return total;
    }
}

