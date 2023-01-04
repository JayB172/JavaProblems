
public class Sort012 {
	
	public static void sort012(int[] arr , int n) {
		
		int zeroCount = 0;
		int oneCount = 0;
		//int twoCount = n - (zeroCount + oneCount);
		int i = 0;
		while(i  < n) {
			if(arr[i] == 0) {
				zeroCount++;
			}
			if(arr[i] == 1) {
				oneCount++;
			}
			i++;
		}
		i = 0;
		while(i < zeroCount) {
			arr[i] = 0;
			i++;
			
		}
		while(i < oneCount + zeroCount) {
			arr[i] = 1;
			i++;
		}
		while(i < n) {
			arr[i] = 2;
			i++;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0 , 1 , 2 , 0 , 1 , 2};
		int n = arr.length;
		sort012(arr, n);
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
