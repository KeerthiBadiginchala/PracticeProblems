import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListAs2DimentionalArray {
	static List<List<Integer>> AList = null;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int NumOfRows = input.nextInt()+1;
		AList = new ArrayList<List<Integer>>(NumOfRows);
		
		for(int i=0;i<NumOfRows;i++){
			String rowList = input.next();
			spiltInputBySpace(rowList); 
		}
		for(int i=0;i<AList.size();i++){
			System.out.println("ele:"+AList.get(i));
		}
		
		int NumOfQueryRows = input.nextInt();
		
		



	}

	public static void spiltInputBySpace(String rowList){

		String[] str = rowList.split(" ");
		List<Integer> row = null;
		for(int rowele=0;rowele<str.length;rowele++){
			row = new ArrayList<Integer>();
			AList.add(rowele, row);
			for(int colele=0;colele<str.length;colele++){
				row.add(new Integer(str[colele+1]));
			}

		}
	}



}
