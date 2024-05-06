
/**
 * Write a description of class Family here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Family
{
    private int famID;
    private char race;
    private int numOfChild;
    private double income;
    public String state;
    
    //normal constructor
    public Family(int famID, char race, int numOfChild,double income, String state)
    {
        this.famID=famID;
        this.race=race;
        this.numOfChild=numOfChild;
        this.income=income;
        this.state=state;
    }
    
    //setter method
    public void setFamID(int famID) {this.famID=famID;}
    public void setRace (char race) {this.race=race;}
    public void setNumOfChild (int numOfChild) {this.numOfChild=numOfChild;}
    public void setIncome (double income) {this.income=income;}
    public void setState (String state) {this.state=state;}
    
    //retriever method
    public int getFamID() {return famID;}
    public char getRace() {return race;}
    public int getNumOfChild() {return numOfChild;}
    public double getIncome() {return income;}
    public String getState() {return state;}
    
    //toString method
    public String toString()
    {
    return ("\n Family ID: " +famID+ "\nRace: " +race+ "\n Number Of Children: " +numOfChild+"\nIncome: " +income+ "\nState: " +state);
    }
    
    //processor that calculates and return averages income
    double sum=0 , avg;
    for(int i=0; i<20; i++)
    {sum = sum+fam[i].getIncome();}
    avg = sum/20;
    System.out.println("\nAverage : " +avg);
}
