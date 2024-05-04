public class AdminP
{
    private String name;
    private String id;
    private String product;
    
    public AdminP (String name, String id, String product){
        this.name = name;
        this.id = id;
        this.product = product;
    }
    
    public String getName() { return name; }
    public String getID() { return id; }
    public String getProduct() { return product; }
    
    public String addProduct() {
        String add = " ";
        return add;
    }
    
    public String removeProduct(){
        String remove = " ";
        return remove;
    }
    
    public String toString() {
        return ("Name: " + name + "\nID Number: " + id + "\nProduct name: " + product); 
    }
    
    public void reportFruits(){
        System.out.println ("Report Fruit Sales: RM "); //+ fruitSales
        System.out.println ("Press ENTER to go back to Admin Page" );
        // admin();
    }
    
    public void reportSmoothies() {
        System.out.println ("Report Smoothies Sales: RM "); //+ smoothiesSales
        System.out.println ("Press ENTER to go back to Admin Page" );
        // admin();
    }
    
    public void totalSales() {
        System.out.println("--------------------------------------");
        System.out.println("         TOTAL SALE PAGE              ");
        System.out.println("--------------------------------------");
        System.out.println ("Total sales: "); // + totalSales;
        System.out.println ("Press ENTER to continue.");
        //getch();
        //admin();
    }
}