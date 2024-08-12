package corejava;

public class Instancevariable {

	    // Declared Instance Variable
	    public String geek;
	    public int i;
	    public Integer I;
	    public Instancevariable()
	    {
	        // Default Constructor
	        // initializing Instance Variable
	        this.geek = "Shubham Jain";
	    }

	    // Main Method
	    public static void main(String[] args)
	    {
	        // Object Creation
	        Instancevariable name = new Instancevariable();

	        // Displaying O/P
	        System.out.println("Geek name is: " + name.geek);
	        System.out.println("Default value for int is "
	                           + name.i);
	      
	     
	        System.out.println("Default value for Integer is "
	                           + name.I);
	    }
	}

