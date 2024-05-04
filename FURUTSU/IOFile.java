import java.util.*;
import java.io.*;
public class IOFile
{
    public static void main(String args[]) throws IOException //must throws IOException for file input/output
    {  try{ //start try
            //declaration for array of object
             AdminPage [] admin=new AdminPage[10];
        
            //to open input file
            FileReader fr=new FileReader("admin.txt");
            BufferedReader br = new BufferedReader(fr);
            
            int count=0;
            StringTokenizer st=null;
            String dataRow=br.readLine(); //to read one line of data
            while(dataRow!=null){
                st=new StringTokenizer(dataRow,"*"); //to cut the word based on ";" delimiter
            
                //a) declare and read first word that represent name
                String name = st.nextToken();
                String ID = st.nextToken();
                
                admin[count] = new AdminPage(name,ID);
                count++; //update the count variable
                
                //d) read the new line of data
                dataRow = br.readLine();
            }
        
            //to write into an output file name studentData.dat
            FileWriter fw=new FileWriter("adminData.dat");
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            
            pw.println("\nData has been saved into adminData.dat:");
            for(int i=0;i<count;i++){               
                pw.println(admin[i].toString());
            }    
         
            System.out.println("\nDetails of all admin: ");
            for (int i=0; i<count; i++){
                System.out.println("\nName: " + admin[i].getName() + "\nStaff ID: " + admin[i].getID());
            }
            
            pw.close();
            bw.close();
       }// end try
       
        catch(EOFException eof){    
            System.out.println("Problem: "+eof.getMessage());
        }
        catch(FileNotFoundException e){ 
            System.out.println("Problem: "+e.getMessage());
        }
        catch(IOException ioe){
            System.out.println("Problem: "+ioe.getMessage());
        }
        finally{
            System.out.println("End of the program"); 
        }
     }//end main 

}