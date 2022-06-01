package basicJava;

import java.util.ArrayList;
import java.util.List;


public class HighestArrayValue {

	public static void main(String[] args) {

		int numbers [] = {7, 15, 74, 1, 6};
		List <Integer> array = new ArrayList<Integer>();
		
		int Big = 0;
		
		for (int i=0;i<numbers.length;i++)
		{
			if (numbers[i]>Big)
			{
				Big=numbers[i];
				
			}
		}
		System.out.println(Big);
	}

}
