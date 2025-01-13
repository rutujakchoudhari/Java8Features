package java8Task;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
public static void main(String[] args) {
	List<String>names = Arrays.asList("Raghu","riddhi","Arpan","Vishal","Rakhi");
	names.forEach(name->System.out.println(name));
}
}
