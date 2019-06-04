package Collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StreamForeach 
{
	public static void main(String[] args) 
	{
		List<String> names = new LinkedList<>();
		names.add("Shinu");
		names.add("Keerthana");
		names.add("Kanika");
		names.add("Saleena");
		names.add("Suji");
		names.add("Priya");
		
		names.stream().forEach(System.out::println);
		
		names.stream().forEach(s->System.out.println(s.length()));
	}
}
