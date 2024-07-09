import java.util.*;
public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		
		stack_push(stack);
		stack_pop(stack);
		stack_peek(stack);
		stack_search(stack, 0);
		stack_search(stack, 8);

	}
	
	//pushing the elements into the stack
	static void stack_push(Stack<Integer> stack) {
		
		for(int i=0;i<5;i++) {
			
			stack.push(i);
		}
		
		System.out.println("Stack is...."+stack);
	}
	
	//popping the elements from stack
	static void stack_pop(Stack<Integer> stack) {
		
		System.out.println("Pop operation...");
		
		for(int i =0;i<3;i++) {
			Integer y = (Integer) stack.pop();
			System.out.println("Popped element.."+y);
		}
	}
	
	//accessing the element form the top of the stack
	static void stack_peek(Stack<Integer> stack) {
		
			Integer y = (Integer) stack.peek();
			System.out.println("Element on the top of the stack "+y);
		
	}
	
	//searching element from the stack
	static void stack_search(Stack<Integer> stack, int element) {
		
		Integer pos = (Integer) stack.search(element);
		
		if(pos==-1) {
			System.out.println("Element not found!!");
		}else {
			System.out.println("Element found on the "+pos+ " position");
		}
	}
	
	

}
