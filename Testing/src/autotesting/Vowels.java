package autotesting;

public class Vowels {

	public static void main(String[] args) {
		String a = "Check if vowels are present in a string";
		char arr[] = a.toLowerCase().toCharArray();
		char vowel [] = {'a','e','i','o','u'};
		
		
		for (int i=0;i<arr.length;i++)
		{
			
			for (int j=0;j<vowel.length;j++)
			{
						
				if (vowel[j]==arr[i])
				{
					System.out.println(arr[i]+" is at "+i);
				}
			}
		}
		
	}

}
