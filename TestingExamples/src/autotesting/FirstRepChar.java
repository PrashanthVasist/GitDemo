package autotesting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepChar {

	public static void main(String[] args) {
		String a = "encyclopedia";
		Map <Character, Integer> rep = new LinkedHashMap<Character, Integer> ();
		for (int i=0;i<a.length();i++)
		{
			if (!rep.containsKey(a.charAt(i)))
			{
				rep.put(a.charAt(i), 1);
			}
			
			else
			{
				int value = rep.get(a.charAt(i));
				rep.put(a.charAt(i), value+1);
			}
		}
		
		for (Entry<Character, Integer> b : rep.entrySet())
		{
			//System.out.println(b.getKey()+ " is Key " + b.getValue()+ " is Value");
			
			if(b.getValue()>1)
			{
				System.out.println("First repeated character is "+b.getKey());
				break;
			}
		}

	}

}
