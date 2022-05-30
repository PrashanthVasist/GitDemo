package autotesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueStringListArray {

	public static void main(String[] args) {
		String a [] = {"Pikachu", "Caterpee", "Pidgeotto", "Bulbasaur", "Charmander", "Squirtle", "Krabby", "Primeape"};
		String b [] = {"Pikachu", "Pidgeotto", "Charmander", "Taurus", "Krabby"};
		
		ArrayList <String> list = new ArrayList<String>(Arrays.asList(a));
		//list.addAll(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		//System.out.println(list);
		
		Map<String, Double> map = new HashMap<String, Double>();
		for (int i=0;i<list.size();i++)
		{
			if (map.containsKey(list.get(i)))
			{
				double value = map.get(list.get(i));
				map.put(list.get(i), value+(0.5));
			}
			else
			{
				map.put(list.get(i), (0.5));
			}
			
		}
		for (Entry<String, Double> entry : map.entrySet())
		{
			if (entry.getValue()==0.5)
			{
				System.out.println(entry.getKey());
			}
		}
		
	}

}
