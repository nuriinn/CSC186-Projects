public class Smoothies extends Drink
{
    private char code;
    private String yogurt;
    
    //normal constructor
    public Smoothies(char code,String yogurt,int qty,int payment)
    {
        super(qty,payment);
        this.code=code;
        this.yogurt=yogurt;
    }
    
    //retriever
    public char getCode() {return code;}
    public String getYogurt() {return yogurt;}
    
    //setter
    public void setCode(char code) {this.code=code;}
    public void setYogurt(String yogurt) {this.yogurt=yogurt;}
    
    public String addOrderSmoothie()
    {
        if(code == 'S')
            return "strawBreaky";
        else if(code == 'T')
            return "tropicalGuava";
        else if(code == 'W')
            return "wonderMelon";
        else if(code == 'M')
            return "mangoTango";
        else if(code == 'G')
            return "grapePotion";
        else
            return"Unknown";
    }
    
    //yogurt
    public double addYogurt()
    {
        double extraCharge = 0;
        if(yogurt.equalsIgnoreCase( "Y"))
            extraCharge = 2.00;
        else if(yogurt.equalsIgnoreCase("N"))
            extraCharge = 0.00;
        return extraCharge;
    }
    
    public double calculateTotal()
    {
        double smoothiePrice = 0;
        
        if(code == 'S')
            smoothiePrice = 6.00;
        else if(code == 'T')
            smoothiePrice = 4.00;
        else if(code == 'W')
            smoothiePrice = 5.00;
        else if(code == 'M')
            smoothiePrice = 5.00;
        else if(code == 'G')
            smoothiePrice = 6.00;
        else
            smoothiePrice = 0;
         
        double extraCharge = addYogurt();
        double total = (smoothiePrice + extraCharge) * qty;
        return total;
    }
    
    public String toString()
    {
        return("\nCode: " +code+ "\nYogurt: "+yogurt);
    }
}

