package basicJava;

import java.util.Scanner;

public class RepToNumbPassword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String password = sc.nextLine();
//		"aabbbcccc";
		System.out.println(password);
		String PassNew = "";
		
		for (int i=1;i<password.length();i++)
		{
			if (password.charAt(i)!=password.charAt(i-1))
			{	
				PassNew = PassNew + "@";
				PassNew = PassNew + password.charAt(i);
			}
			else
			{
				PassNew = PassNew + password.charAt(i);
			}
		}
		PassNew = password.charAt(0)+PassNew;
		System.out.println(PassNew);
		String[] PassArray = PassNew.split("@");
		
		for (int j=0;j<PassArray.length;j++)
		{
			System.out.print(PassArray[j].length());
			System.out.print(PassArray[j].charAt(0));
		}

	}

}
