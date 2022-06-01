package basicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonInTwoArray {

	public static void main(String[] args) {
		
		String [] first = {"One", "Two", "Three", "Four"};
		String [] second = {"Three", "Four", "Five", "Six"};
		
		ArrayList <String> rep = new ArrayList<String>();
		
		
		for (int i=0;i<first.length;i++)
		{
			for (int j=0;j<second.length;j++)
			{
				if (first[i].equals(second[j]))
				{
					rep.add(first[i]);
				}
			}
			
		}
		
		rep.toArray();
		System.out.println(rep);
		
	}

}

