package basicJava;

public class PracticeObject {
	
	
	public static void main (String [] args)
	{
		int [] num = {-55, 5, 4, 14, 72, 45};
		
		System.out.print(num[0]);
		System.out.print(num[1]);
		System.out.print(num[2]);
		System.out.print(num[3]);
		System.out.println(num[4]);
		
		int dummy;
//		num[2]=num[1];
		
		for (int i=1;i<num.length;i++)
		{
			for (int j=i;j>0;j--)
			if (num[j]<num[j-1])
			{
				dummy=num[j];
				num[j]=num[j-1];
				num[j-1]=dummy;
			}
		}
		System.out.println();
		for (int k=0;k<num.length;k++)
		{
		System.out.print(num[k]+", ");
		}
	}

}
