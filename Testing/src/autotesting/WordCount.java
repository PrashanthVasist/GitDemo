package autotesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {

	public static void main(String[] args) {
		String a = "Vinay is teaching me Java as Vinay knows java";
		String b[] = a.toLowerCase().split(" ");
		
		Map <String,Integer> m = new HashMap <String,Integer>();
		for (int i=0;i<b.length;i++)
		{
			if(m.containsKey(b[i]))
			{
				int value = m.get(b[i]);
				m.put(b[i], value+1);
			}
			else
			{
				m.put(b[i], 1);
			}
			
		}
		
		for (Entry <String,Integer> v : m.entrySet())
		{
			System.out.println(v.getKey()+" is repeated "+v.getValue()+" times");
		}
	}

}
