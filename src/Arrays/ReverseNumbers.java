package Arrays;

public class ReverseNumbers {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		
		int length = arr.length;
		
		for(int i=length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
