package autotesting;

import java.util.Arrays;

public class replaceAll
{
public static void main(String args[])
          {  
			
	
	
			String s1="vinay";
			String s2="vinis";
			//String replaceString=s1.repla
			
			char[] arr=s1.toLowerCase().toCharArray();
			char[] arr1=s2.toLowerCase().toCharArray();
			Arrays.sort(arr);
			Arrays.sort(arr1);
			
			
			//s1 = s1.replaceAll("[0-9]","");//replaces all occurrences of "a" to "e"  
			
			System.out.println(Arrays.equals(arr, arr1));
			
			/*s1 = s1.trim();
			s1 = s1.replaceAll(" +", " ");
			//String g=replaceString.toString();
			//System.out.println(s1.charAt(0)); 
			//System.out.println(g.charAt(0)); 
			//System.out.println(g)*/;
			System.out.println(s1);
          }
}


