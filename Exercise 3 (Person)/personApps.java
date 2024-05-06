
/**
 * Write a description of class personApps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class personApps
{
    public static void main(String args[])
    {
        // input person details
        Scanner input=new Scanner(System.in);
        Scanner inputText=new Scanner(System.in);
        
        String name,district,state,country;
        int age;
        
        System.out.println("Enter name:");
        name=inputText.nextLine();
        System.out.println("Enter age:");
        age=input.nextInt();
        System.out.println("Enter District:");
        district=inputText.nextLine();
        System.out.println("Enter State:");
        state=inputText.nextLine();
        System.out.println("Enter Country:");
        country=inputText.nextLine();
        
        //declare and create object
        Person p=new Person(name,new HomeTown(district,state,country),age);
        
        //display age
        System.out.println("Age: " +p.getAge());
        
        //display country
        System.out.println("Country: " +p.getHomeTown().getCountry()); 
    }
}
