import java.util.Scanner;

public class KthSmallestElement {
	
	public static void Divide(int[] arr , int si , int ei , int mid) {
		
		int i, j, k;
		
		int n1 = mid - si + 1;
		int n2  = ei - mid;
		
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		for(i = 0 ; i < n1 ; i++) {
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
			} else {
				 arr[k] = rightArr[j] ;
				j++;
			}
			k++;
		}
		while(i < n1) {
			arr[k] = leftArr[i] ;
			i++;
			k++;
		}
		while(j < n2) {
			 arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
	
	public static void merge(int[] arr, int si , int ei ) {
		
		
		if(si < ei) {
			
			int mid = (si + ei)/2;
			
			merge(arr , si , mid);
			merge(arr , mid + 1 , ei);
			Divide(arr , si , ei , mid);	
		}
	

	}
	
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
		int kthsmallest = 0;
		int n = arr.length;
		l = 0;
	    r = n -1;
		merge(arr , l , r);
		kthsmallest = arr[k -1];
		
		return kthsmallest;
        
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = s.nextInt();
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int l= 0;
		int r = n-1;
		int k = 3;
		merge(arr , l , r);
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int a = kthSmallest(arr , l, r , k);
		System.out.println(a);

	}

}
