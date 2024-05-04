public class SmoothiesP extends DrinkP
{
    private char code, milkType;
    
    //normal constructor
    public SmoothiesP(char code, char milkType,int qty,int payment)
    {
        super(qty,payment);
        this.code=code;
        this.milkType=milkType;
    }
    
    //retriever
    public char getCode() {return code;}
    public char getMilkType() {return milkType;}
    
    //setter
    public void setCode(char code) {this.code=code;}
    public void setMilkType(char milkType) {this.milkType=milkType;}
    
    //milkType Selection
    public void addMilkType(char type)
    {
        if(type == 'D' || type == 'N')
            milkType=type;
    }
    
    public String addMilkType() //dairy and non-dairy
    {  
        if(milkType == 'D')
            return "Dairy";
        else if(milkType == 'N')
            return "Non-Dairy";
        else
            return "Unknown";
    }
    
    //Smoothies Selection
    public void addOrderSmoothie(char cd)
    {
        if(cd == 'S' || cd == 'O' || cd == 'D' || cd == 'G' || cd == 'W' || cd == 'M' || cd == 'E')
            code=cd;
    }
    
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
            
        double total = smoothiePrice*qty;
        return total;
    }
}