package Arrays;

public class EvenOddArrays {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,11,10};
		int sum=0,sum1=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				sum = sum+arr[i];
			}
			else if(arr[i]%2!=0) {
				
			sum1 = sum1+arr[i];
			 
			 }
			else {
				System.out.println("alphabet");
			}
			
		}
		System.out.println("even_numbers sum is:"+sum);
		System.out.println("odd_numbers sum is:"+sum1);
	}

}
