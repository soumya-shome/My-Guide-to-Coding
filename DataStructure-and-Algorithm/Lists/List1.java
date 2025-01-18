package Lists;
/*
	Lists are immutable

	Is an ordered collection

	Allows Duplicates items

	New items are added at the end of the list
*/
import java.util.*;

public class List1 {
	public static void main(String args[]) {
		List<String> words = List.of("Apple","Bat","Cat");//immutable
		
		System.out.println(words.size());
		
		System.out.println(words.isEmpty());
		
		System.out.println(words.get(0));
		
		System.out.println(words.contains("Dog"));
		
		System.out.println(words.indexOf("Cat"));
		
		System.out.println(words.indexOf("Dog"));
		
		System.out.println("Using basic for loops : ");
		for(int i=0; i<words.size(); i++) {
			System.out.println(words.get(i));
		}

		System.out.println("Using enhanced for loops : ");
		for(String word:words) {
			System.out.println(word);
		}

		System.out.println("Using iterators : ");
		Iterator wordsIterator = words.iterator();
		while(wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
	}
}
