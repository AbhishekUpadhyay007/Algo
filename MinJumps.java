
public class MinJumps {
	
	public static void main(String[] args) {
		
		int ar[] = {0,1 ,5,2,6,78};
		
		int res = minJumps(ar, 0);
		
		System.out.println("Minimum jumps to reach end is: "+ res);
		
	}
	

	private static int minJumps(int[] ar, int start) {
				
		boolean isFound = false;
		int jump = 0;
		int range = (ar.length - 1) - start;
		if(ar[start] >= range) {
			return 1;
		}else {
			jump += 1;
			int[] check = new int[ar[start]];
			int index = start+1;
			for(int i=0; i<check.length;i++) {
				check[i] = ar[index];
				boolean checked = checkTrue(ar, check[i], index);
				if(checked) {
					isFound = true;
					jump += 1;
					break;
				}
				index++;
				
			}
		}
		if(isFound) {
			return jump;
		}else {
			jump += minJumps(ar, start+1);
			return jump;
	}	
}	
	private static boolean checkTrue(int arr[], int num, int start) {
		
		int r = (arr.length -1) - start;
		
		if (r <= num) {
			return true;
		}else
			return false;
		
	}

}
