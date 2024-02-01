package lab2;

public class VariableDemo {
	
	// Instance variables
    int instanceIntVariable = 10;
   
    // Static variable
    static int staticIntVariable = 20;    

    // Member method
    public void printVariableValues() {
        // Local variable
        int localVariable = 5;

        System.out.println("Instance Int Variable: " + instanceIntVariable);        
        System.out.println("Local Variable: " + localVariable);
    } 

	public static void main(String[] args) {
		 
        VariableDemo demo = new VariableDemo();

        // Call the member method to print instance and local variable values
        demo.printVariableValues();
        
        //print instance variable
        System.out.println(demo.instanceIntVariable);
        
        // print static variable
        System.out.println("Static Int Variable: " + staticIntVariable); 
		
	}

}
