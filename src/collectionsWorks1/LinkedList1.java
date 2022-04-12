package collectionsWorks1;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<Object> li = new LinkedList<Object>();
		li.add("Mango");
		li.add("Apple");
		li.add("Banana");
		li.add("Jack Fruit");
		li.add("Watermelon");
		
		System.out.println(li);
		
		li.set(4, "Kiwi");
		
		System.out.println(li);
		
		System.out.println(li.get(0));
		
		LinkedList<Object> di = new LinkedList<Object>();
		di.add("Dates");
		di.add("Cashew Nut");
		di.add("Badam");
		di.add("Apple");
		
		System.out.println(di);
		
		li.addFirst("Grapes");
		li.addLast("Watermelon");
		
		System.out.println(li);
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		li.removeFirst();
		System.out.println(li);
		
		li.removeLast();
		System.out.println(li);
		
		li.retainAll(di);
		System.out.println(li);
		
		li.clear();
		
		System.out.println(li.isEmpty());
		
	}

}
