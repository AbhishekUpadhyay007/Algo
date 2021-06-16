import java.util.Stack;

public class ReducedString {
	
	static Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {
	
		String str = "baab";
		
//		stack.push('a');
//		System.out.println(stack.peek());
	
		
		String result = reducedString(str);
		System.out.println(result);

	}

	private static String reducedString(String str) {
		if(str.length() == 0) {
			return "";
		
		}
		
		stack.push(str.charAt(0));
	
		
		for(int i=1 ; i<str.length(); i++) {
			
			 if(!stack.isEmpty() && stack.peek() == str.charAt(i)) {
				 stack.pop();
			 }else {
				 stack.push(str.charAt(i));
			 }
			
		}
		
		if(stack.isEmpty()) {
			return "Empty String";
		}else {
			StringBuffer string = new StringBuffer();
			
			for(int i =0 ; i<stack.size() ; i++) {
				string.append(stack.get(i));
			}
			
			return string.toString();
		}
		
		
	}

}
