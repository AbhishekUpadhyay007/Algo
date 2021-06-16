
public class recursion {

	public static void main(String[] args) {
		
		System.out.println(sum(5));
		System.out.println(pow(5, 5));
		
	}
	
	static int sum (int n) {
		
		if(n == 1) {
			return 1;
		}
				
		return n + sum(n-1);
	}
	
	public static int pow(int n, int z) {
		
		if(z==0) {
			return 1;
		}
		
		return n * pow(n,z-1);
	}

}
