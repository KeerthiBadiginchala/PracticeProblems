
@FunctionalInterface
interface HelloLambda{
	
	void print(int a, String b);
}

public class LambdaDemo {
	
	public static void main(String[] args) {
		HelloLambda hello = (a, b) -> {
			System.out.println("hello");
			a = 10;
			b = "test";
			System.out.println(a+b);
		};
		
		hello.print(5, "abc");
	}

}
