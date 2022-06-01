package autotesting;

public class Highest {

	public static void main(String[] args) {
		
		int a[] = {0, 1, 8, 13, 5, 2, 6};
		int highest=Integer.MIN_VALUE;
		int secHighest=Integer.MIN_VALUE;
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>highest)
			{
				secHighest=highest;
				highest=a[i];
				
			}
			
			else if(a[i]>secHighest)
			{
				secHighest=a[i];
			}
			
		}
		
		System.out.println("Highest = "+highest);
		System.out.println("Second Highest = "+secHighest);
		
		
		
		//int highest = a[0];
		
		/*for (int i=0;i<a.length;i++)
		{
			if (a[i]>highest)
			{
				highest=a[i];
			}
			
			
		}*/
		//System.out.println("The highest number is "+highest);
		
	}

}
