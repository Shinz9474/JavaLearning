package Collections;

import java.util.LinkedList;
import java.util.List;

public class StreamToArray 
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
		
		Object[] arr = names.stream().toArray(Object[]::new);
		for(Object o : arr)
		{
			System.out.println(o);
		}
	}

}
