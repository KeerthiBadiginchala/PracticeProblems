import java.util.StringTokenizer;

import java.io.*;
import java.util.*;
interface PerformOperation {
	boolean check(int a);
}
class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	// Implementing Lambda to check Even or Odd

	public PerformOperation isOdd(){
		PerformOperation isOdd = a -> {
			System.out.println("number: "+a);
			if(a % 2 == 0)
				return false;
			else 
				return true;
		};
		return isOdd;
	}
	// Implementing Lambda to check Prime or not
	public PerformOperation isPrime(){
		PerformOperation isPrime = a -> {
			for(int n=2;n<=Math.sqrt(a);n++){
				if(a%n == 0)
					return false;
			}
			return true;
		};
		return isPrime;
	}
	// Implementing Lambda to check Palindrome or not
	public PerformOperation isPalindrome(){
		PerformOperation isPalindrome = a -> {

			int sum = 0, rem = 0;

			for(int n = a;n > 0;n = n/10){
				System.out.println("n: "+n);
				rem = n%10;
				sum = sum * 10+ rem;
				System.out.println("sum: "+sum+"rem: "+rem);
			}
			System.out.println("sum: "+sum+"a: "+a);
			if(sum == a)
				return true;
			else 
				return false;
		};
		return isPalindrome;
	}
}
public class OddPrimePalindromeWithLambda {
	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		System.out.println("T: "+T);
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T--> 0) {
			String s = br.readLine().trim();
			System.out.println("s: "+s);
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = MyMath.checker(op, num);
				System.out.println("EvenOrOdd: op:"+op.getClass()+"..ret: "+ret);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = MyMath.checker(op, num);
				System.out.println("Prime: op:"+op.check(num)+"..ret: "+ret);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = MyMath.checker(op, num);
				System.out.println("Palindrome: op:"+op.toString()+"..ret: "+ret);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
