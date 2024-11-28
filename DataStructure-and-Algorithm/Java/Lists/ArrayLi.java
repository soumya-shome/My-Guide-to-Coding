package Lists;

/*
	ArrayLists are mutable
	Is an ordered collection
	Allows Duplicates items
	New items are added at the end of the list
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLi {
	public static void main(String args[]) {
		List<String> words = List.of("Apple","Bat","Cat");//immutable
		
		//List<String> wordsArrayList = new ArrayList<String>();
		
		List<String> wordsArrayList = new ArrayList<String>(words);

		System.out.println(wordsArrayList.size());
		
		System.out.println(wordsArrayList.isEmpty());
		
		System.out.println(wordsArrayList.get(0));
		
		System.out.println(wordsArrayList);
		
		System.out.println(wordsArrayList.set(1, "Cow"));
		
		System.out.println(wordsArrayList.contains("Dog"));
		
		System.out.println(wordsArrayList.indexOf("Cat"));
		
		System.out.println(wordsArrayList.indexOf("Dog"));
		
		System.out.println(wordsArrayList.add("Dog"));
		
		System.out.println(wordsArrayList);
		
		System.out.println(wordsArrayList.remove(2));
		
		System.out.println(wordsArrayList);
		
		Collections.sort(wordsArrayList);
		
		System.out.println(wordsArrayList);
		
		wordsArrayList.clear();
		
		System.out.println(wordsArrayList);
	}
}
