package Arrays;

public class Multiplication_Of_Matrix {

	public static void main(String[] args) {
		int[][] m = {{1,2,3},{4,5,6}};
		int[][] m1 = {{2,3},{3,4},{4,5}};
		int[][] result = new int[2][2];
		int sum=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<3;k++) {
					sum=sum+m[i][k]*m1[k][j];
				
				result[i][j]=sum;
				sum=0;
				}
			}
		}
//			for(int i=0;i<2;i++) {
//				for(int j=0;j<2;j++) {
//					System.out.print(" "+result[i][j]);
//				}
//			
//			System.out.println();
//		}    
		for(int i[]:result) {
			for(int j: i) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}

}
