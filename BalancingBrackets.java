import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {
		
		String s = "((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}";
		
		Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            	
            if(stack.isEmpty() && (ch == '}' || ch ==']' || ch == ')')) {
            	break;
            }
            
            switch(ch){
                case '(':
                    stack.push(ch);
                    break;
                case '{':
                    stack.push(ch);
                    break;
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.peek() == '('){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    break;
                case '}':
                    if(stack.peek() == '{'){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    break;
                case ']':
                    if(stack.peek() == '['){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    break;
                default:
                	break;
            }
        }
        
        if(stack.isEmpty()){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

	}

}
