package autotesting;

import java.util.ArrayList;
import java.util.List;

public class Array {
	static int arr[]  = {-1,-5,-2,-4,-6,-3};
	public static void main(String[] args) {

		//int arr[]  = {1,2,3,4,5,6};
		String arr2[] = {"One", "Two", "Three"};
		List <String> ar = new ArrayList<String>();
		
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		int highest = arr[0];
		for (int i=arr.length-1; i>=0; i--)
		{
			if (arr[i]<highest)
			{
				highest = arr[i];
			}
		}
		
		System.out.println(highest);
		
	}

}
