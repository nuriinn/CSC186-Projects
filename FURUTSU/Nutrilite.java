import java.util.Scanner;
import java.io.*;
public class Nutrilite {
    
    public static int customer = 10;
    public static int count=0;
    
    public static void main(String args[]) throws Exception {
        try{
            Drink[] drink = new Drink[customer];
            Scanner input = new Scanner(System.in);
            
            while (true) 
            {
                
                System.out.println("\n-----------------------------------------------------------------");
                System.out.println("                       Welcome to Nutrilite                       ");
                System.out.println("-----------------------------------------------------------------");
                
                
                System.out.println("Enter [1] Fruits or [2] Smoothies or [3] Exit or [4] Admin Page: ");
                int option = input.nextInt();
                if (option == 1) {
                    FruitsMenu();
                    
                    System.out.println("\nEnter the fruit code : ");
                    int code = input.nextInt();
                    System.out.println("Do you want to add condiments [Y] or [N] : ");
                    String condiments = input.next();
                    System.out.println("Enter your order quantity : ");
                    int quantity = input.nextInt();
                    System.out.println("Enter payment method [1] Paywave or [2] Cash : ");
                    int payment = input.nextInt();

                    drink[count++] = new Fruits(code,condiments,quantity,payment);
                }
                else if (option == 2)
                {
                    SmoothiesMenu();

                    System.out.println("\nEnter your smoothie code : ");
                    char code = input.next().charAt(0);
                    System.out.println("Do you want to add yogurt [Y] or [N] :");
                    String yogurtType = input.next();
                    System.out.println("Enter your order quantity : ");
                    int quantity = input.nextInt();
                    System.out.println("Enter payment method [1] Paywave or [2] Cash : ");
                    int payment = input.nextInt();
                                    
                    drink [count++]= new Smoothies(code, yogurtType, quantity, payment);
                }
                else if (option == 3)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid option !");
                    pause();
                }
                displayOrder(drink);
                paymentMethod(drink[count - 1]);
                adminPage(drink);
             }
            System.out.println("Thank you for purchasing with us!");

        }
        catch(Exception e) {}
    }
     
    //Go to Admin Page
        public static void adminPage(Drink[] drink) {
        AdminPage[] admin = new AdminPage[1];
    
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to proceed to the admin page? [Y/N] ");
        String proceed = input.next();
        if (proceed.equalsIgnoreCase("Y")) {
            System.out.println("Enter username: ");
            String username = input.next();
            System.out.println("Enter password: "); 
            String password = input.next();
        
            if (username.equals("staff") && password.equals("1234")) {
                for (int i = 0; i < 1; i++) {
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("                     Welcome to Admin Page                       ");
                    System.out.println("-----------------------------------------------------------------");
                
                    System.out.println("\n\nEnter your name:  ");
                    String name = input.next();
                    System.out.println("Enter staff ID:  ");
                    String staffID = input.next();
                
                    admin[i] = new AdminPage(name, staffID);
                    
                    System.out.println("\n\nEnter [1] Fruits Sales [2] Smoothies Sales [3] Total Sales: ");
                    int option = input.nextInt();
                
                    double fruitSales = 0.0;
                    double smoothiesSales = 0.0;
                    double totalSales = 0.0;
                    if (option == 1) {
                        for (int x = 0; x < drink.length; x++) {
                            if (drink[i] instanceof Fruits) {
                                fruitSales = fruitSales + drink[i].calculateTotal();
                            }
                        }
                        System.out.println("--------------------------------------");
                        System.out.println("         TOTAL FRUIT SALES            ");
                        System.out.println("--------------------------------------");
                        System.out.println("\nReport Fruit Sales: RM " + fruitSales);
                        pause();
                    } else if (option == 2) {
                        for (int y = 0; y < drink.length; y++) {
                            if (drink[i] instanceof Smoothies) {
                                smoothiesSales = smoothiesSales + drink[i].calculateTotal();
                            }
                        }
                        System.out.println("--------------------------------------");
                        System.out.println("       TOTAL SMOOTHIES SALES          ");
                        System.out.println("--------------------------------------");
                        System.out.println("\n\nReport Smoothies Sales: RM " + smoothiesSales);
                        pause();
                    } else if (option == 3) {
                        totalSales = fruitSales + smoothiesSales;
                    
                        System.out.println("--------------------------------------");
                        System.out.println("         TOTAL SALE PAGE              ");
                        System.out.println("--------------------------------------");
                        System.out.println("Total sales: " + totalSales);
                        pause();
                    } else {
                        System.out.println("Invalid Option.");
                        pause();
                    }
                }
            } else {
                pause();
            }
        } else {
            pause();
        }
    }

    // fruits menu
    public static void FruitsMenu()
    {
         System.out.println("\nList of menu: ");
                    System.out.println(" ---------------------------------------");
                    System.out.println("|  CODE  |     FRUITS     |    PRICE   |");
                    System.out.println(" --------+----------------+-------------");
                    System.out.println("|   1    |   Strawberry   |    RM 6    |");
                    System.out.println(" --------+----------------+-------------");
                    System.out.println("|   2    |      Guava     |    RM 4    |");
                    System.out.println(" --------+----------------+-------------");
                    System.out.println("|   3    |   Watermelon   |    RM 5    |");
                    System.out.println(" --------+----------------+-------------");
                    System.out.println("|   4    |     Mango      |    RM 5    |");
                    System.out.println(" --------+----------------+------------ ");
                    System.out.println("|   5    |     Grape      |    RM 6    |");
                    System.out.println(" ---------------------------------------");
                    System.out.println("\nThere will be an extra RM2.00 charge if you choose to add condiments.");
    }
    
    //smoothies menu
    public static void SmoothiesMenu()
    {
        System.out.println("\nList of menu: ");
                    System.out.println("------------------------------------------");
                    System.out.println("|  CODE  |  SMOOTHIES NAME  |    PRICE   |");
                    System.out.println("---------+------------------+-------------");
                    System.out.println("|   S    |   strawBreaky    |    RM 6    |");
                    System.out.println("---------+------------------+-------------");
                    System.out.println("|   T    |   tropicalGuava  |    RM 4    |");
                    System.out.println("---------+------------------+-------------");
                    System.out.println("|   W    |   wonderMelon    |    RM 5    |");
                    System.out.println("---------+------------------+-------------");
                    System.out.println("|   M    |   mangoTango     |    RM 5    |");
                    System.out.println("---------+------------------+-------------");
                    System.out.println("|   G    |   grapePotion    |    RM 6    |");
                    System.out.println("------------------------------------------");
                    System.out.println("\nThere will be an extra RM2.00 charge if you choose to add yogurt.");
    }
    
    // Display order function
    public static void displayOrder(Drink[] drinks){
            for (int i = 0; i < drinks.length; i++) {
                System.out.println("Your order details");
                System.out.println("--------------------------------");
                if (drinks[i] instanceof Fruits) {
                    System.out.println("Fruits Order:");
                    System.out.println("--------------------------------");
                    System.out.println(drinks[i].toString());
                } else if (drinks[i] instanceof Smoothies) {
                    System.out.println("Smoothies Order:");
                    System.out.println("--------------------------------");
                    System.out.println(drinks[i].toString());
                }
                System.out.println("--------------------------------");
            }
    }
    
    // Payment method function
    public static void paymentMethod(Drink drink){
            int payment = drink.getPayment();
            double total = drink.calculateTotal();
            if (payment == 1) {
                System.out.println("Receiving...");
                System.out.println("Total amount: RM " + total);
                System.out.println("Enjoy your beverages!");
            } else if (payment == 2) {
                System.out.println("Please insert your money.");
                System.out.println("Please take your change.");
                System.out.println("Total amount: RM " + total);
                System.out.println("Enjoy your beverages!");
            } else {
                System.out.println("Invalid payment method");
            }   
    }
    
    public static void pause(){
        Scanner in = new Scanner(System.in);
        System.out.println("Press any key to continue...");
        String _pause = in.nextLine();
    }

}