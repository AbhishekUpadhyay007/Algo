import java.util.*;
public class text {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,100}, {2,5,100},{3,4,100}};
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int n[] = new int[length];
		
		for(int i =0;i<length;i++) {
			n[i] = 0;
		}
				
		for(int b[] : a) {
			
			for(int i = b[0]-1; i<b[1];i++) {
				n[i]+=b[2];
			}
			
		}
		
		for(int i =0;i<n.length;i++) {
			System.out.print(n[i]+ " ");
		}
		System.out.println();
		
		Arrays.sort(n);
		System.out.println(n[n.length-1]);
		  
		
	}

}
