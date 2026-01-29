package praticeJava;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPratice {
	
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,25,10,28,3,7,9,100,76,77);
		List<Integer> list2 = list1.stream().filter(x -> x%2==0).collect(Collectors.toList());
		//filter(lambda expression) -> reducing num from stored value
		System.out.println("Even nums :" + list2);
		
		
		List<Integer> list3 = list1.stream().map(x-> x*x).collect(Collectors.toList()); 
		// map() -> manipulate (not reducing numbers from stored list)
		System.out.println("square of nums :" + list3);
		
		
		List<Integer> list4 = List.of(1,25,10,28,3,33,43,22,13,45,22,1,25,10,7,9,100,76,77);
		List<Integer> list5 = list4.stream().distinct().collect(Collectors.toList());
		//distinct() -> remove same values and print unique value only
		System.out.println("remove duplicate print only unique values :"+list5);
		
		List<Integer> list6 = list4.stream().distinct().sorted().collect(Collectors.toList());
		//distinct() and sorted() -> remove duplicates print in ascending order
		System.out.println("remove duplicate  print only unique values in ascending order :"+list6);
		
		List<Integer> list7 = list4.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//distinct() and sorted(Comparator.reverseOrder()) -> remove duplicates print in descending order
		System.out.println("remove duplicate  print only unique values in descending order :"+list7);
	}

}
