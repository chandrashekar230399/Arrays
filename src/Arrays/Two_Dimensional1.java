package Arrays;

import java.util.Scanner;

public class Two_Dimensional1 {
	int[][] n = new int[3][3];
	
	Scanner sc =new Scanner(System.in);
	public void showData() {
	System.out.println("enter two dimensional numbers:");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			n[i][j]=sc.nextInt();
			
		}
	}
	}
	public void displayData() {
		System.out.println("The array elements in matrix format:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i>j) {
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
