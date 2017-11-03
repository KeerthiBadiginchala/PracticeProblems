import java.util.Scanner;


public class PrimeNumber {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Prime Number: "+PrimeNumber.isPrime(s.nextInt()));
	
		
	}
	
	public static boolean isPrime(long x) {
		System.out.println("..sqrt: "+Math.sqrt(x));
		//Math.sqrt(num) for that number covers all digits from 1-9.. hence the all checks should be validated
	    for (long n = 2; n <= Math.sqrt(x); n++) {
	    	System.out.println("x%n: "+x % n);
	        if (x % n == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}

/*
 
 import java.util.function.IntPredicate;
import java.util.stream.IntStream;
public class Main {
  public static void main(String[] args) {
    System.out.println(isPrime(123));
  }

  private static boolean isPrime(int number) {
    IntPredicate isDivisible = index -> number % index == 0;
    return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
  }
}
 
 
 */
			