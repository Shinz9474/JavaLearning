package Collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterCountDemo 
{
	public static void main(String[] args) 
	{
		List<String> names = new LinkedList<>();
		List<String> capnames = new LinkedList<>();
		Set<String> sortedNames = new HashSet<>();
		names.add("Shinu");
		names.add("Keerthana");
		names.add("Kanika");
		names.add("Saleena");
		names.add("Suji");
		names.add("Priya");
		
		sortedNames = names.stream().filter(s->s.endsWith("a")).collect(Collectors.toSet());		
		capnames = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(capnames);
		
		long count = names.stream().filter(s->s.endsWith("a")).count();
		System.out.println(count+" elements in the below list\n"+sortedNames);
	}
}
