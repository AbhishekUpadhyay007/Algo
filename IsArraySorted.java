import java.util.Arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		
		int arr[] = {23,43,45,56,60,70,90,11};
		
		System.out.println(isSorted(arr));
		
	}

	static boolean isSorted(int[] arr) {
		
		if(arr.length == 0 || arr.length == 1) {
			return true;
		}
		
		if(arr[0]>arr[1]) {
			return false;
		}
		
		return isSorted(Arrays.copyOfRange(arr, 1, arr.length));
	}

}