package basicJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedString {

	public static void main(String[] args) {
		String sentence = "She sells sea shells by the sea shore";
		String [] words = sentence.split(" ");
		
		Map <String, Integer> map = new LinkedHashMap<String, Integer>();
		
		System.out.println(map.entrySet());
		
		for (int i=0;i<words.length;i++)
		{
			if (map.containsKey(words[i]))
			{
				int value = map.get(words[i]);
				map.put(words[i], value+1);
			}
			else
			{
				map.get(words[i]);
				map.put(words[i], 1);
			}
		}
		
		System.out.println(map.entrySet());
		System.out.println(map.entrySet().size());
//		map.entrySet().clear();
//		System.out.println(map.entrySet());
		
		for (Entry <String, Integer> list : map.entrySet())
		{
			if (list.getValue()==1)
			{
			System.out.println("The word \""+list.getKey()+"\" is repeated "+list.getValue()+" times");
			}
		}
		

	}

}
