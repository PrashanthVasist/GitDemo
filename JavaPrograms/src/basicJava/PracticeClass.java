package basicJava;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class PracticeClass {

	static String reverseFinal;
	public String firstString()
	{
		String one = "My first sentence";
		return one;
	}
	public static int hero(int a, int b )
	{
		
		int sum = a+b;
		return sum;
	}
	
	public static String reverseString(String se)
	{
		String reverse = "";
		for (int i=se.length()-1;i>=0;i--)
		{
			char r1 = se.charAt(i);
			reverse = reverse + r1;
		}
		reverseFinal = reverse;
		System.out.println(reverseFinal);
		return reverse;
	}
	public static void main (String [] args) {
		
		
		int a = 5; 
		int b = 10;
		
		
		Object sum;
		System.out.println(hero(a, b));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");

		String se = sc.nextLine();
		reverseString(se);
		
		
		if (se.equalsIgnoreCase(reverseFinal))
		{
			System.out.println("The String '"+se+"' is a Palindrome");
		}
		else
		{
			System.out.println("The String '"+se+"' is not a Palindrome");
		}
	}
	

}
