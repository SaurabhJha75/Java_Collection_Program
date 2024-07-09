import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		//creating default vector
		Vector v1 = new Vector();
		
		v1.add(67);
		v1.add(85);
		v1.add("Saurabh");
		v1.add("Paal");
		v1.add(89.09);
		
		System.out.println(v1);
		
		//iterating vector
		for(int i=0;i<v1.size();i++) {
			System.out.print(v1.get(i)+ "  ");
		}
		
		//creating generic vector
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(10);
		v.add(5);
		v.add(17);
		System.out.println(v);
		
		v.add(2, 79);
		v.add(108);
		v.add(9876);
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		
		int size = v.capacity();
		System.out.println(v.size());
	}

}
