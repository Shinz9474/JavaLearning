package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilter 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		List<Integer> evenlist = new ArrayList<>();
			list.add(2);
			list.add(5);
			list.add(4);
			list.add(9);
			list.add(6);
			list.add(5);
			list.add(2);
			list.add(7);
			list.add(11);
			list.add(12);
			list.add(21);
			list.add(24);
			
		//Find the list of even numbers without lambdas
		System.out.println("Without Streams");
		for(Integer i : list)
		{
			if(i%2==0)
			{
				evenlist.add(i);
			}
		}
		System.out.println(evenlist);
			
		System.out.println("With Streams");
		evenlist = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenlist);
	}
}
