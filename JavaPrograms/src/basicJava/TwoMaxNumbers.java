package basicJava;

public class TwoMaxNumbers {

	public static int highest;
	public static int lowest;
	public static int secHighest;
	public static int secLowest;
	
	public static void main(String[] args) {
		
		int [] numb = {4, 7, 15, 5, 33/2, 9};
		
		for (int i=0;i<numb.length;i++)
		{
			lowest = lowest + numb[i];
			secLowest = secLowest + numb[i];
			highest = highest - numb[i];
			secHighest = secHighest - numb[i];
		}
		
		for (int i=0;i<numb.length;i++)
		{
			if (numb[i]>highest)
			{
				highest=numb[i];
			}
			if (numb[i]>secHighest && numb[i]<highest)
			{
				secHighest=numb[i];
			}
		}
		
		System.out.println("Second Highest value is "+secHighest);
		System.out.println("Highest value is "+highest);

		
		for (int j=0;j<numb.length;j++)
		{
			if (numb[j]<lowest)
			{
				lowest=numb[j];
			}
			if (numb[j]<secLowest && numb[j]>lowest)
			{
				secLowest=numb[j];
			}
		}
		System.out.println("Second Lowest value is "+secLowest);
		System.out.println("Lowest value is "+lowest);

	}
	
	

}
