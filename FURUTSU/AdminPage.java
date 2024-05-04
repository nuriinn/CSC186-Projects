public class AdminPage
{
    private String name;
    private String id;
    
    public AdminPage (String name, String id){
        this.name = name;
        this.id = id;
    }
    
    public String getName() { return name; } 
    public String getID() { return id; }

    public void setName(String name){
        this.name = name;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
 
    public String toString() {
        return ("Name: " + name + "\nID Number: " + id); 
    }
    
}