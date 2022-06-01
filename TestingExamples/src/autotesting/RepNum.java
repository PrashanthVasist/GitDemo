package autotesting;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepNum {

	public static void main(String[] args) {
		int numb[] = {8,9,0,4,1,1,0,2,9,2};   
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for (int i=0;i<numb.length;i++)
		{
			if (map.containsKey(numb[i]))
			{
				int Value = map.get(numb[i]);
				map.put(numb[i], Value+1);
			}
			else
			{
				map.put(numb[i], 1);
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet())
		{
			if (entry.getValue()==1)
			{
				System.out.println(entry.getKey());
			}
		}

	}

}
