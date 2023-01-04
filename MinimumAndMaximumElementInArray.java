import java.util.Scanner;



class pair  
{  
   long first, second;  
   public pair(long first, long second)  
   {  
       this.first = first;  
       this.second = second;  
   }  
} 
public class MinimumAndMaximumElementInArray {
	
	
	public static pair minimumElement(int[] arr) {
		
		
		long first = arr[0];
		long second = arr[0];
		pair P = new pair(first , second);
		for(int i=1;i<arr.length ; i++) {
			
			if(P.first > arr[i] ) {
				P.first = arr[i];
		
			}
		}
		for(int i = 1 ; i < arr.length ; i++) {
			if(P.second < arr[i]) {
				P.second  = arr[i];
			}
		}
		
		return P;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0 ; i < arr.length ; i++){
			arr[i] = s.nextInt();
			System.out.println(arr[i]);
		}
		pair P = minimumElement(arr);
		System.out.println("minimum element is " + P.first);
		System.out.println("maximum element is " +P.second);
		
		
		
	}

}
