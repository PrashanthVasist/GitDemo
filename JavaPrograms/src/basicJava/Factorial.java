package basicJava;

import org.apache.poi.util.SystemOutLogger;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 5;
		int factorial = num;
		
		for (int i=num-1;i>1;i--)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);

	}

}
