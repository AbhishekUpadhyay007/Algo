
public class recursion_string {
	
	static int i = -1;
	static String output;
	
	public static void main(String[] args) {
		
		String str = "pipixxipipxxxxcipipipipipiiiipp";
		
		output = "";
		
//		String res = string(str, output);
		System.out.println(string(str));
		
	}
	
	static String string(String s) {
		
		String output = "";
		
		if(s.length()>=1) {
			
			if(s.length() == 1) {
				return s;
			}
			
			if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
				output += "3.14";
				return output+ string(s.substring(2));
			}else {
				output += s.charAt(0);
				return output+ string(s.substring(1));
			}
			
		}
		
		return output ;
	
	}
}
