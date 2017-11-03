import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class Solution {
	
	    public static int solution(int[] A) {
	        // write your code in Java SE 8
	    	/*that, 
	    	 * given an array A of N integers, returns the smallest positive integer 
	    	 * (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.*/
	    	
	    	
	    	TreeSet<Integer> elements = new TreeSet<>();
	    	int sum = 0;
	    	
	    	
	    	for(int a:A){
	    		elements.add(a);
	    	}
	    	
	    	//elements.stream().allMatch((Integer)num -> num>0);
	    	boolean isNegivtive = false;
	    	for(int ele : elements){
	    		sum += ele;
	    		if(ele < 0)
	    			isNegivtive = true;
	    	}
	    	
	    	System.out.println("elements:"+elements.toString()+"sum:"+sum+"..isNegivtive: "+isNegivtive);
	    	int max = elements.last();
	    	//System.out.println(".."+elements.stream().filter(elements.toString().indexOf(elements.toString().length())));
	    	System.out.println("max:"+max);
	    	int sumOfNum = max*(max+1)/2;
	    	int missingInt = sumOfNum -sum;
	    	System.out.println("sumOfNum:"+sumOfNum);
	    	if(missingInt == 0){
	    		return max+1;
	    	}else if(isNegivtive)
	    		return 1;
	    	return missingInt;
	    	
	    }
	    public static void main(String[] args) {
	    	int[] a = {-1, -3};
	    	//Missing Integer 
	    	int s = solution(a);
	    	System.out.println("Missing Integer:"+s);
	    	
	    	
	    	//Longest Binary Gap Prg
	    	Scanner input = new Scanner(System.in);
	    	String str = Integer.toBinaryString(input.nextInt());
	    	int longestBinGap = findLongestBinaryGap(str);
	    	System.out.println("longestBinGap: "+longestBinGap);
		}
	    
	    public static Integer findLongestBinaryGap(String str){
	    	System.out.println("Binary Number: "+str);
	    	String[] str1 = str.split("1");
	    	TreeSet<Integer> s = new TreeSet<>();
	    	for(String str2: str1){
	    		if(str2.length() > 1)
	    			s.add(str2.length());
	    	}
	    	s.forEach(s1 -> System.out.println("TS Ele:"+s1));
	    	if(s.size()>0)
	    		return s.last().intValue();
	    	else 
	    		return 0;
	    }
	
}
//var yourself = {
//	    fibonacci : function(n) {
//	        if (n === 0) {
//	            return 0;
//	        } else if (n === 1) {
//	            return 1;
//	        } else {
//	            return this.fibonacci(n - 1) +
//	                this.fibonacci(n - 2);
//	        }
//	    }
//	};