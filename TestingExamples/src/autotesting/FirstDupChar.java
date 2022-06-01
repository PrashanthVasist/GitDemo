package autotesting;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstDupChar {

	public static void main(String[] args) {
		String word = "repeatability";
		
		Map <Character, Integer> map = new LinkedHashMap <Character, Integer>();
		for (int i=0;i<word.length();i++)
		{
			if (!map.containsKey(word.charAt(i)))
			{
				map.put(word.charAt(i), 1);
			}
			else
			{
				int Value = map.get(word.charAt(i));
				map.put(word.charAt(i), Value+1);
			}
		}
		
		
		for (Entry <Character, Integer> entry : map.entrySet())
		{
			if (entry.getValue() == 2)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
