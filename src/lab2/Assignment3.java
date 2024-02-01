package lab2;

public class Assignment3 {
	
	// Instance variables
    int instanceIntVariable;
   
    // Static variable
    static int staticIntVariable = 20;  
    
    // Default constructor
    
    Assignment3()
    {
    	System.out.println("Inside Default Constructor");
    }
    
    // Constructor to assign value to instance variable
    
    public Assignment3(int value)
    {
    	instanceIntVariable = value;
    }

    // Member method1
    public void printVariableValues() {
        // Local variable
        int localVariable = 5;

        System.out.println("Instance Int Variable: " + instanceIntVariable);        
        System.out.println("Local Variable: " + localVariable);
    } 
    
    // Member method2
    public void display() {
        
    	System.out.println("Inside Display");
    } 

	public static void main(String[] args) {
		
		Assignment3 obj = new Assignment3();
		obj.display();
		
		Assignment3 demo = new Assignment3(10);

        // Call the member method to print instance and local variable values
        demo.printVariableValues();
        
        //print instance variable
        System.out.println(demo.instanceIntVariable);
        
        // print static variable
        System.out.println("Static Int Variable: " + staticIntVariable);
	}

}
