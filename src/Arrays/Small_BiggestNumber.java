package Arrays;

public class Small_BiggestNumber {

	public static void main(String[] args) {
		int[] arr = {2,3,1,45,5555,70,56,99,777};
		
		int temp,r,p,m = 0;
		int length = arr.length;
		for(int i=0;i<length-1;i++) {
		for(int j=i+1;j<length;j++) {
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				r = arr[length-1];
				p = arr[length-2];
				m = r-p;
			}
		}
		}
		System.out.println("biggest number:"+arr[length-1]);
		System.out.println("second biggest number:"+arr[length-2]);
		System.out.println("smallest number:"+arr[0]);
		System.out.println("diff b/w 1st and 2nd number:"+m);
	}

}
