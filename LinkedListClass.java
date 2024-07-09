import java.util.*;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating linkedList 
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//adding elements in the list
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(2, 30);
		
		System.out.println(list);
		
		//removing elements from the list
		list.remove();
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		
		System.out.println("List element iterating by Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		
		//iterating the list
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i)+ " ");
		}
		
		//converting list into array by using toArray()
		Object[] s = list.toArray();
		for(Object element : s) {
			System.out.print(element+ " ");
		}
		
		list.removeLast();
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}

}
