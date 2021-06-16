import java.util.Date;
import java.util.*;
import java.time.*;

public class ReverseStack {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		double millis = System.nanoTime();
		
		System.out.println("Time : "+ millis);
		
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> empty = new Stack<>();
		stack.push(7);
		stack.push(3);
		stack.push(4);
		stack.push(8);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		
		System.out.println(stack);
		System.out.println(reverse(stack,empty));
		
		double second = System.nanoTime();
		System.out.println("Executed time: " + (second - millis));

	}

	static Stack<Integer> reverse(Stack<Integer> stack,Stack<Integer> empty) {
		
		int size = stack.size();
					
		if(size > 0) {
			
			int element = stack.peek();
			stack.pop();
			empty.push(element);
			
			empty = reverse(stack, empty);
		}
		
		return empty;
	}

}
