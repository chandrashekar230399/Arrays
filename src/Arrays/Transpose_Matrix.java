package Arrays;

import java.util.Scanner;

public class Transpose_Matrix {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter rows and columns:");

		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				 a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter transpose matrix:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(" "+a[j][i]);
			}
			System.out.println();
		}
	}

}
