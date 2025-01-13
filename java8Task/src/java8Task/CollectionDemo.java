package java8Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionDemo {
	public static void main(String[] args) {
		List<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("seven");
  List<String>StartsWithT = numbers.stream().filter(number->number.startsWith("T")).collect(Collectors.toList());
		  StartsWithT.forEach(System.out::println);
	}
}
