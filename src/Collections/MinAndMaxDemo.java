package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMaxDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		List<Integer> sortedList = new ArrayList<>();
			list.add(22);
			list.add(15);
			list.add(9);
			list.add(43);
			list.add(6);
			list.add(35);	
			list.add(7);
			list.add(13);
			list.add(4);
			list.add(9);
			list.add(16);
			list.add(5);
			list.add(12);
			list.add(7);
			list.add(2);
			list.add(11);
			list.add(12);
			list.add(21);
			list.add(24);
		System.out.println("Unsorted list\n"+list);
		
		sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List\n"+sortedList);
		
		Integer min = sortedList.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max = sortedList.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
	}

}
