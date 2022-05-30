package basicJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Couples {

	public static void main(String[] args) {
		
		String [] names = {"Mutthuraj", "Sampath", "Amarnath", "Naveen Kumar"};
		String [] wife = {"Parvathamma", "Bharathi", "Sumalatha", "Radhika"};
		
		Map <String, String> map = new HashMap<String, String>();
		
//		map.put("Mutthuraj", "Parvathamma");
//		map.put("Sampath", "Bharathi");
//		map.put("Amarnath", "Sumalatha");
//		map.put("Naveen Kumar", "Radhika");
		
		for (int i=0;i<names.length;i++)
		{
			if (map.containsKey(names[i]))
			{
				System.out.println("The Husband name is already present, hence cannot be added");
			}
			else
			{	
				map.put(names[i], wife[i]);
			}
		}
		
		
		System.out.println(map.entrySet());
		
		for (Entry <String, String> each : map.entrySet())
		{
			System.out.println("The wife of "+each.getKey()+" is "+each.getValue());
		}
		
		

	}

}
