
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Person
{    
   
   private String name;
   private HomeTown HT;
   private int age;
   
   //default constructor
   public Person ()
   {
     name =" ";
     HT=new HomeTown();
     age = 0;
   }
   
   //normal contructor
   public Person (String name, HomeTown HT,int age)
   {
       this.name=name;
       this.age=age;
       this.HT=HT;
   }
   
   //retriever method
   public String getName() {return name;}
   public int getAge() {return age;}
   public HomeTown getHomeTown() {return HT;}
   
   //toString method
   public String toString()
   {
       return ("\nName: " +name+ "\nAge: " +age+ "\nHometown Details:\n   " +HT.toString());
   }
}
