import java.util.Arrays;

public class BinarySearchSort {
	
	public static void main(String[] args) {
		int arr[] = {10,15,20,25,30,40,50};
	
		int mid = binarySearchSort(arr, 20, 0,arr.length-1);
		if(mid==-1) System.out.println("Element not found");
		else
		System.out.println(mid);
	}

	private static int binarySearchSort(int[] arr, int x, int l, int r) {
		
		if(r>=1)
		{
			int mid = l + ((r - l) / 2);
//			int mid = r / 2;
			if(arr[mid] == x) {
				return mid;
			}
			
			if(x<arr[mid]) {
				return binarySearchSort(arr,x, l, mid-1);
			}else {
				return binarySearchSort(arr, x, mid+1, arr.length-1);
			}
		}
	
		return -1;
		
				
	}

}
