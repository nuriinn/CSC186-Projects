
/**
 * Write a description of class HomeTown here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class HomeTown
{
   private String district;
   private String state;
   private String country;
   
   
   //default constructor
   public HomeTown ()
   {
       district=" ";
       state=" ";
       country=" ";
   }
   
   //normal contructor
   public HomeTown (String district, String state, String country)
   {
       this.district=district;
       this.state=state;
       this.country=country;
   }
   
   //retriever method
   public String getDistrict() {return district;}
   public String getState() {return state;}
   public String getCountry() {return country;}
   
   //toString method
   public String toString()
   {
       return ("\nDistrict: " +district+ "\nState: " +state+ "\nCountry: " +country);
   }
}
