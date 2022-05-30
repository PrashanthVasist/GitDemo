package basicJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedChar {

	public static void main(String[] args) {
		
		String name = "HelloWorld";

		Map <Character, Integer> map = new HashMap <Character, Integer>();
		
		for (int i=0;i<name.length();i++)
		{
			if (map.containsKey(name.charAt(i)))
				{
					int value = map.get(name.charAt(i));
					map.put(name.charAt(i), value+1);
				}
			else
			{
				map.put(name.charAt(i), 1);
			}
		}
		
		for (Entry <Character, Integer> list : map.entrySet())
		{
			if (list.getValue()>1)
			{
			System.out.println("The word \""+list.getKey()+"\" is repeated "+list.getValue()+" times");
			}
		}

	}

}
