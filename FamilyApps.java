
/**
 * Write a description of class FamilyApps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FamilyApps
{
   public static void main (String args[])
   {
       Family [] fam =new Family [20];
       
       //get the data from the user
       Scanner inputText=new Scanner (System.in);
       Scanner inputNum=new Scanner (System.in);
       for(int i=0; i<20; i++)
       {
           System.out.println("Enter Family ID: " );
           int famID = inputNum.nextInt();
           System.out.println("Enter Race: ");
           char race = inputText.next().chartAt(0);
           System.out.println("Enter number of children: ");
           int numOfChild = inputNum.nextInt();
           System.out.println("Enter Family's Income Per Month: ");
           double income = inputText.nextDouble();
           System.out.println("Enter State of Residence: ");
           String state = inputText.nextLine();
           //
           
       }
       
       //Display the information of families in the state "Kelantan"
       if(fam [i].state.equalsIgnoreCase("Kelantan"));
           System.out.println("\n Details of families: ");
           
       //calculate total income according to race
       double totIncome=0;
       for(int i=0: i<20; i++)
           totIncome = totIncome + race;
           return 
   }
}
