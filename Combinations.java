import java.util.*;
public class Combinations {
	
	static String output ="";
	
	public static void main(String[] args) {
		
		String str = "abcd";
		
		System.out.println(str.substring(0,4));
		StringBuffer string  = new StringBuffer(20);
		string.append("jksdhfnsdflkdsmfdslffkldmgkldfd");
		System.out.println(string.length());
		
//		findSequences(str, output);
		
	}
	
	// Using recursion we are finding the sequences.

	private static void findSequences(String str, String output) {
		
		if(str.length() == 0) {
			System.out.println(output);
			return;
		}
				
		findSequences(str.substring(1), output + str.charAt(0));
		findSequences(str.substring(1), output );
		
	}

}
