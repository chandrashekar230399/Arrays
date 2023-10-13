package Arrays;

public class SearchElement {

	public static void main(String[] args) {
		int[] arr = {5,6,7,89,99,2};
		
		int search_Element=89;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(search_Element==arr[i]) {
				System.out.println("element found at:"+i);
				flag=true;
				break;
			}
		}
			if(flag==false) {
				System.out.println("element not found");
			}

	}

}
