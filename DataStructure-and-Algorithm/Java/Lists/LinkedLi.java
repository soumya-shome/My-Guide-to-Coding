package Lists;
/*
	LinkedLists are mutable

	Is an ordered collection

	Allows Duplicates items

	New items are added at the end of the list
*/
import java.util.LinkedList;
import java.util.List;

public class LinkedLi {
	public static void main(String args[]) {
		List<String> words = List.of("Apple","Bat","Cat");//immutable
		
		List<String> wordsLinkedList = new LinkedList<String>(words);

		System.out.println(wordsLinkedList.size());
		
		System.out.println(wordsLinkedList.isEmpty());
		
		System.out.println(wordsLinkedList.get(0));
		
		System.out.println(wordsLinkedList.contains("Dog"));
		
		System.out.println(wordsLinkedList.indexOf("Cat"));
		
		System.out.println(wordsLinkedList.indexOf("Dog"));
		
		System.out.println(wordsLinkedList.add("Dog"));

		System.out.println(wordsLinkedList);
	}
}
