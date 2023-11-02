import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class CollectionMaxStrings {
	
	public static void main(String[] args) {
		
		class minStringComparator implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		}

		minStringComparator mscObj = new minStringComparator();
		
		List<String> list;
		//list = new ArrayList<String>();		
		//list = new LinkedList<String>();		
		list = new Vector<String>();			
		
		Collections.addAll(list, "Anurag", "Arpit", "Kaustubh", "Sainatham");
		System.out.println(list); 
		
		Collections.sort(list); // String is Comparable.
		System.out.println(list);
		
		System.out.println("Max among strings : " + Collections.max(list)); 
		//Works like Dictionary -ASSIGNMENT TASK
		System.out.println("Max among strings : " + Collections.min(list)); 
		//Similar method
		System.out.println("Max among strings : " + Collections.max(list,mscObj)); 
		//Using max with a comparator as argument
	}

}
