import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=10;i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.remove(4);
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
		}

	}

}
