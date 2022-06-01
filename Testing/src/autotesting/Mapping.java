package autotesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapping {

	public static void main(String[] args) {

		String e = "malayalam";
		Map <Character,Integer> m = new HashMap<Character,Integer>();
		for (int i=0;i<e.length();i++)
		{
			if(m.containsKey(e.charAt(i)))
			{
				int value = m.get(e.charAt(i));
				m.put(e.charAt(i), value+1);
			}
			
			else
			{
				m.put(e.charAt(i), 1);
			}
			
		}
		
		for (Entry <Character,Integer> p : m.entrySet())
		{
			System.out.println(p.getKey()+" is repeated "+p.getValue()+" times");
		}
	}

}
