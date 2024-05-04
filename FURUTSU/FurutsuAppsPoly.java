import java.util.Scanner;
import java.io.*;
public class FurutsuAppsPoly {
    
    public static int customer = 2;
    public static int count=0;
    
    public static void main(String args[]) throws Exception {
        try{
            DrinkP[] drink = new DrinkP[customer];
            Scanner input = new Scanner(System.in);
            
            while (true) 
            {
                
                System.out.println("-----------------------------------------------------------------");
                System.out.println("                       Welcome to Nutrilite                       ");
                System.out.println("-----------------------------------------------------------------");
                
                
                System.out.println("Enter [1] Fruits or [2] Smoothies or [3] Exit : ");
                int option = input.nextInt();
                if (option == 1) {
                    FruitsMenu();
                    
                    System.out.println("Enter the fruit code : ");
                    int code = input.nextInt();
                    System.out.println("Do you want to add condiments [Y] or [N] : ");
                    String condiments = input.next();
                    System.out.println("Enter your order quantity : ");
                    int quantity = input.nextInt();
                    System.out.println("Enter payment method [1] Paywave or [2] Cash : ");
                    int payment = input.nextInt();

                    drink[count++] = new FruitsP(code,condiments,quantity,payment);
                }
                else if (option == 2)
                {
                    SmoothiesMenu();

                    System.out.println("Enter your smoothie code : ");
                    char code = input.next().charAt(0);
                    System.out.println("Do you want to add yogurt [Y] or [N] :");
                    char yogurtType = input.next().charAt(0);
                    System.out.println("Enter your order quantity : ");
                    int quantity = input.nextInt();
                    System.out.println("Enter payment method [1] Paywave or [2] Cash : ");
                    int payment = input.nextInt();
                                    
                    drink [count++]= new SmoothiesP(code, yogurtType,quantity,payment);
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
               adminPage(drink[count-1]);
             }
            System.out.println("Thank you for purchasing with us!");
        }
        catch(Exception e) {}
    }
        
    public static void adminPage(DrinkP drink) {
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to proceed to the admin page? [Y/N] ");
            String proceed = input.next();
            if (proceed.equalsIgnoreCase("Y")) {
                System.out.println("Enter your name:  ");
                String name = input.next();
                System.out.println("Enter staff ID:  ");
                int staffID = input.nextInt();
                // Go to the admin page
            } 
            else {
                pause();
            }
    }

    // fruits menu
    public static void FruitsMenu()
    {
         System.out.println("\nList of menu: ");
                    System.out.println(" ----------------------------------------------------------");
                    System.out.println("|  CODE  |     FRUITS     |     CONDIMENTS   |    PRICE   |");
                    System.out.println(" --------+----------------+---------+--------+-------------");
                    System.out.println("|   1    |   Strawberry   |    Y    |    N   |    RM 6    |");
                    System.out.println(" --------+----------------+---------+--------+------------+");
                    System.out.println("|   2    |      Guava     |    Y    |    N   |    RM 4    |");
                    System.out.println(" --------+----------------+---------+--------+------------+");
                    System.out.println("|   3    |   Watermelon   |    Y    |    N   |    RM 5    |");
                    System.out.println(" --------+----------------+---------+--------+------------+");
                    System.out.println("|   4    |     Mango      |    Y    |    N   |    RM 5    |");
                    System.out.println(" --------+----------------+---------+--------+------------+ ");
                    System.out.println("|   5    |     Grape      |    Y    |    N   |    RM 6    |");
                    System.out.println(" ----------------------------------------------------------");
    }
    
    //smoothies menu
    public static void SmoothiesMenu()
    {
        System.out.println("\nList of menu: ");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("|  CODE  |  SMOOTHIES NAME  |  DAIRY  |  NON-DAIRY  |    PRICE   |");
                    System.out.println("---------+------------------+---------+-------------+------------");
                    System.out.println("|   S    |   strawBreaky    |    D    |      N      |    RM 6    |");
                    System.out.println("---------+------------------+---------+-------------+------------");
                    System.out.println("|   T   |   tropicalGuava  |    D    |      N      |    RM 4    |");
                    System.out.println("---------+------------------+---------+-------------+------------");
                    System.out.println("|   W    |   wonderMelon    |    D    |      N      |    RM 5    |");
                    System.out.println("---------+------------------+---------+-------------+------------");
                    System.out.println("|   M    |   mangoTango     |    D    |      N      |    RM 5    |");
                    System.out.println("---------+------------------+---------+-------------+------------");
                    System.out.println("|   G    |   grapePotion    |    D    |      N      |    RM 6    |");
                    System.out.println("-----------------------------------------------------------------");
    }
    
    // Display order function
    public static void displayOrder(DrinkP[] drinks){
            for (int i = 0; i < drinks.length; i++) {
                System.out.println("Your order details");
                System.out.println("--------------------------------");
                if (drinks[i] instanceof FruitsP) {
                    System.out.println("Fruits Order:");
                    System.out.println("--------------------------------");
                    System.out.println(drinks[i].toString());
                } else if (drinks[i] instanceof SmoothiesP) {
                    System.out.println("Smoothies Order:");
                    System.out.println("--------------------------------");
                    System.out.println(drinks[i].toString());
                }
                System.out.println("--------------------------------");
            }
    }
    
    // Payment method function
    public static void paymentMethod(DrinkP drink){
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
