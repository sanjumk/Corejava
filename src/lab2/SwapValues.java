package lab2;

public class SwapValues {
	
	float num1 = 12.5F;
	float num2 = 13.4F;
	float temp;
	public void swapValues( )
	{
		System.out.println(" Before swap - num1 = "+ num1 + " num2 =" + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(" After swap - num1 = "+ num1 + " num2 =" + num2);	
	}

	public static void main(String[] args) {
		
		SwapValues s = new SwapValues();
		s.swapValues();
	}

}
