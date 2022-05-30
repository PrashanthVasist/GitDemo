package basicJava;

public class JavaBasic1 {

	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		int c = 3;
		
		double d1 = 3.14;
		double d2 = 6.28;
		
		System.out.println(a+b+d1+d2);
				

		if (a>b) 
		{
			if (a>c)
			{
				System.out.println("The biggest number is "+a);
			}
			else
			{
				System.out.println("The biggest number is "+c);
			}
		}
		else if (b>a)
		{
			if (b>c)
			{
				System.out.println("The biggest number is "+b);
			}
			else
			{
				System.out.println("The biggest number is "+c);
			}
		}
		
		if (a>b & a>c)
		{
			System.out.println("The biggest number is in \"a\" which is "+a);
		}
		else if (b>c)
		{
			System.out.println("The biggest number is in \"b\" which is "+b);
		}
		else
		{
			System.out.println("The biggest number is in \"c\" which is "+c);
		}
	}
	
	//New Method just calling

}
