package Arrays;

import java.util.Scanner;

public class Two_Dimensional2 {
	int[][] n=new int[3][3];
	
	Scanner sc = new Scanner(System.in);
	public void readData() {
		System.out.println("enter two-dimenstional numbers");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				n[i][j]=sc.nextInt();
				
			}
		}
	}
	public void printData() {
		System.out.println("the array elements in matrix are:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i>=j) {
					System.out.print(" "+n[i][j]);
				}
				else {
					n[i][j]=0;
					System.out.print(" "+n[i][j]);
				}
			}
		System.out.println();
		}
	}
	
	
}
