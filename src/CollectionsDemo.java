import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;


public class CollectionsDemo {
	
	public static void main(String[] args) {
		/*List l = new ArrayList();
		l.add(0,"abc");
		l.add(1,new Integer(1));
		
		HashSet s= new HashSet();
		
		s.add("String1");
		s.add("String2");
		

		
		System.out.println("Result"+l.toString());*/
		
		
		        System.out.println("Demonstration of removeIf");
		        List<String> l1 = createList();
		        // remove all items which contains an "x"
		        //l1.removeIf(s-> s.toLowerCase().contains("x"));
		        //l1.removeIf(s -> s.toLowerCase().contains("x"));
		        //l1.forEach(s->System.out.println(s));
		        
		        Map<String, String> map = new HashMap<>();
		        fillData(map);
		        // write to command line
		        //map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
		        map.forEach((k,v)-> System.out.println(k+""+v));

		    }

		    private static List<String>  createList() {
		        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
		    }
	
		    private static void fillData(Map<String, String> map) {
		        map.put("Android", "Mobile");
		        map.put("Eclipse IDE", "Java");
		        map.put("Eclipse RCP", "Java");
		        map.put("Git", "Version control system");

		    }
	
	
}
