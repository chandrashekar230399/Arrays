package Arrays;

import java.util.Scanner;

public class Two_Dimensional {
	int [][]n= new int[3][3];
	int i,j;
	Scanner sc = new Scanner(System.in);
	public void readData()
	{
		System.out.println("enter elements into Two dimenstional array");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				n[i][j]=sc.nextInt();
			}
		}
	}
	public void printData()
	{
		System.out.println("The array  elements in matrix format are");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i==j)
				{
					System.out.print(" " + n[i][j]);
				} 
				else
				{
					n[i][j]=0;
					System.out.print(" " + n[i][j]);
				}
			
			}
			System.out.println();	
			}
	}

}
 



