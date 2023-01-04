import java.util.Arrays;

public class sepratingNegativeElements {
	
	public static void joinArray(int[] arr,int[] array1 , int[] array2) {
		 int pos = 0;
		for (int element : array1) {
            arr[pos] = element;
            pos++;
        }

        for (int element : array2) {
            arr[pos] = element;
            pos++;
        }
	}
	
	public static void seprateNegativeElements(int[] arr , int n) {
		
		int positiveNumberCount = 0;
		int negativeNumberCount = 0;
		
		
		
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] < 0) {
				negativeNumberCount++;
				
			}else {
				positiveNumberCount++;
			}
		}
		int[] posArray = new int[positiveNumberCount];
		int[] negArray = new int[negativeNumberCount];
		int pos = 0;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] >= 0) {
				 posArray[pos] = arr[i];
				 pos++;
			}
			
		}
		pos = 0;
		for(int i = 0 ; i <  n; i++) {
			if(arr[i] < 0) {
				negArray[pos] = arr[i];
				pos++;
			}
			
		}
		joinArray(arr, posArray , negArray);
		
		System.out.println(Arrays.toString(posArray));
		System.out.println(Arrays.toString(negArray));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub                                                           
		int arr[] = {1 , -1 , -2 , 3, -4};
		int n = arr.length;
		seprateNegativeElements(arr , n);
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}

	} 

}
