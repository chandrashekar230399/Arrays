package Arrays;

public class Decending {

	public static void main(String[] args) {
		int[] arr= {23,78,65,98,50,3,67,99};
		int temp=0;
		System.out.println("enter original array:");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				
			}
			System.out.print("");
		}	
	}
		System.out.println("enter descending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
  }
	

	}


