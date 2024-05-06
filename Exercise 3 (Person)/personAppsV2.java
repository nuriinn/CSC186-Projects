import java.util.Scanner;
public class personAppsV2
{
    public static void main(String args[])
    {
        //declare array of object
        Person [] p =new Person [3];
        
        // input person details
        Scanner input=new Scanner(System.in);
        Scanner inputText=new Scanner(System.in);
        
        String name,district,state,country;
        int age;
        
        for(int i=0; i<3;i++)
        {
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
            p[i]=new Person(name,new HomeTown(district,state,country),age);
        }
        
        for(int i=0;i<3;i++)
        {
            //display age
            System.out.println("Age: " +p[i].getAge());
        }
        
        //display country
        for(int i=0;i<3;i++)
        {
            System.out.println("Country: " +p[i].getHomeTown().getCountry()); 
        }
    }
}
