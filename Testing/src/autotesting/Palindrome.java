package autotesting;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String a = sc.nextLine();
		String rev = "";
		sc.close();
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}

		if (a.equals(rev)) {
			System.out.println("Palindrome");
		} else {

			System.out.println("Not Palindrome");
		}
	}

}