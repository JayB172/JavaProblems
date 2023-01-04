
public class MergeSort {
	
	public static void merge(int arr[] , int si, int ei) {
		
		if(si < ei) {
			int mid = (si+ei)/2;
			merge(arr, si , mid);
			merge(arr , mid + 1 , ei);
			divide(arr , si , ei , mid);
			
		}
		
	}
	
	public static void divide(int arr[] , int si, int ei, int mid) {
		int i, j ,k;
		int n1 = mid - si + 1; 
		int n2 = ei - mid;
		
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		
		for( i = 0 ; i < n1 ; i++) {
			leftArr[i] = arr[si + i];
		}
		for(j = 0 ; j < n2 ; j++) {
			rightArr[j] = arr[mid + 1 + j];
		}
		i = 0;
		j = 0;
		k = si;
		
		while(i < n1 && j < n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}
	
	static void printArray(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2 , 8 ,7 ,9 , 15 ,10 , 12 };
		int n = arr.length;
		printArray(arr , n);
		System.out.println();
		merge(arr , 0 , n-1);
		printArray(arr , n);
		
		

	}

}
