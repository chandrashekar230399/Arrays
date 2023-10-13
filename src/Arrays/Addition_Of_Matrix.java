package Arrays;

import java.util.Scanner;

public class Addition_Of_Matrix {

	public static void main(String[] args) {
	int[][] a=new int[3][3];
	int[][] b=new int[3][3];
	int[][] c=new int[3][3];
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a matrix:");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			a[i][j]=sc.nextInt();
		}
	}
		System.out.print("Enter b matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("2st matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		System.out.println("sum of a and b matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		
	}
}
