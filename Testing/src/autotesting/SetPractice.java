package autotesting;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		//String a[] = {"Vinay", "Vinay", "vinay", "Prashanth", "Prashanth", "Ullas", "Shreyas", "Pradeep", "Sujan", "James"};
		
		Set <String> s = new HashSet<String>();
		s.add("Vinay");
		s.add("Vinay");
		s.add("vinay");
		s.add("Prashanth");
		s.add("Prashanth");
		s.add("123");
		
		System.out.println(s);

	}

}
