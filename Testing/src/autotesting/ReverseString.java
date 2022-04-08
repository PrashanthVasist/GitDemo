package autotesting;

public class ReverseString {

	public static void main(String[] args) {
		String a = "Vinay is a good boy";
		
		String c[] = a.split(" ");
		String rev = "";
		for (int i=c.length-1;i>=0;i--)
		{
		rev = rev + " "+c[i];
		}
		
		System.out.println(rev.trim());
		
		String pal = "mysore";
		//String d = "";
	
		for (int j=pal.length()-1;j>=0;j--)
		{
			System.out.print(pal.charAt(j));
			//d = d + pal.charAt(j);
		}
		
		/*if (pal.equalsIgnoreCase(d))
		{
			System.out.println("Entered word is a Palindrome");
		}
		
		else
		{
			System.out.println("Entered word is not a Palindrome");
		}*/
	}

}
