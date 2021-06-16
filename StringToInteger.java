
public class StringToInteger {

	public static void main(String[] args) {
		
		String str ="45643214564";
		
		long num = convertTo(str);
		System.out.println(num);

	}

	private static long convertTo(String str) {
		
		if(str.length() == 0) {
			return 0;
		}
		
		if(str.length() == 1) {
			return Integer.parseInt(str);
		}
		
		long x =  Character.getNumericValue(str.charAt(0));
		long res = (long) (x * Math.pow(10, str.length()-1));
		
		return res + convertTo(str.substring(1, str.length()));
		
	}

}
