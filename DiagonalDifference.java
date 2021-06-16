
public class DiagonalDifference {

	public static void main(String[] args) {
	
		int arr[][] = {
				{15,27,53},
				{46,58,36},
				{78,88,91}
		};
		
		int a = 0;
		int b = 0;
		for(int i = 0; i<arr.length;i++) {
			a = a + arr[i][i]; 
			b = b + arr[i][(arr.length - 1) - i]; 
		}
		System.out.println(a+" "+b);
		System.out.println(Math.abs(a-b));
		
		

	}

}
