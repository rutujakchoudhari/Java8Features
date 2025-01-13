package java8Task;

interface Demo1 {

	void display();

}

public class LambdaExpreessionDemo {

	public static void main(String[] args) {
		Demo1 demo = () -> System.out.println("Lambda is called");
		demo.display();
	}

}
