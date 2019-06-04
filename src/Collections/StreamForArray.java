package Collections;

import java.util.stream.Stream;

public class StreamForArray 
{
	public static void main(String[] args) 
	{
		System.out.println("For any group object");
		Stream<Integer> s1 = Stream.of(1, 2, 4, 6, 21, 13, 9, 27, 5, 17);
		s1.forEach(System.out::print);
		
		System.out.println("\nFor an array");
		Integer[] arr = {1, 4, 2, 8, 12, 4, 32, 65, 1, 23, 4};
		Stream<Integer> s2 = Stream.of(arr);
		s2.forEach(System.out::print);
	}
}
