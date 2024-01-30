package lab1;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();
        int quotient = num1 / num2;
        System.out.println("Quotient is" + quotient);
        int remainder = num1 % num2;
        System.out.println("Remainder is" + remainder);
	}

}
