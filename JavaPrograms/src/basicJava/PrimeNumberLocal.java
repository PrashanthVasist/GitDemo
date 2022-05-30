package basicJava;

public class PrimeNumberLocal {

	public static void main(String[] args) {
		
		int [] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
		
		for (int i=0;i<a.length;i++)
		{
			
			int n = a[i];
			checkPrimeNumber(n);
		}

	}

	public static void checkPrimeNumber(int n)
	{
		boolean flag = true;
		
		if(n==0 || n==1)
		{
			System.out.println(n+" is not a Prime Number");
		}
		else
		{
			int m=n/2;
			for (int i=2;i<m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not a Prime Number");
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(n+" is a Prime Number");
			}
		}
		
	}
}
