package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortedDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		List<Integer> sortedList = new ArrayList<>();
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
		System.out.println("Unsorted list\n"+list);
		
		sortedList= list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted with default sorting:\n"+sortedList);
		
		sortedList= list.stream().sorted((i1, i2)->i1>i2?-1:i1<i2?+1:0).collect(Collectors.toList());
		System.out.println("Sorted with comparator sorting:\n"+sortedList);
		
		sortedList= list.stream().sorted((i1, i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Sorted with comparator sorting using compareTo():\n"+sortedList);
	}
}
