package lab4;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);
		
		switch(Character.toLowerCase(ch))
		{
		case 'a':
			System.out.println("Character is a vowel");
			break;
		case 'e':
			System.out.println("Character is a vowel");
			break;
		case 'i':
			System.out.println("Character is a vowel");
			break;
		case 'o':
			System.out.println("Character is a vowel");
			break;
		case 'u':
			System.out.println("Character is a vowel");
			break;
			default:
				System.out.println("Character is a Consonant");
		}
	}

}
