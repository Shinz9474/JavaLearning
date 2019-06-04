package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMaps 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new LinkedList<>();
		List<Integer> doubleList = new LinkedList<>();
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
		
		System.out.println("Without Streams");
		for(Integer i : list)
		{
			doubleList.add(i*2);
		}		
		System.out.println(doubleList);
		
		System.out.println("With Streams");
		doubleList = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(doubleList);
	}

}
