import java.util.Scanner;
class MulMatrix
{
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter the no of Row for matrix-1    :");
		int r1=sc.nextInt();

		System.out.print("Enter the no of Column for matrix-1 :");
		int c1=sc.nextInt();

		System.out.print("Enter the no of Row for matrix-2    :");
		int r2=sc.nextInt();

		System.out.print("Enter the no of Column for matrix-2 :");
		int c2=sc.nextInt();

		System.out.println();
		int [][]a=new int[r1][c1];
		int [][]b=new int[r2][c2];
		int [][]c=new int[r1][c2];

		if(c1!=r2)
		{
			System.out.println("Matrix Multiphication is not possible :");
			return;
		}

		//getting input from user for matrix-1
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.printf("Enter the element of matrix-1 [%d][%d] :",i,j);
				a[i][j]=sc.nextInt();
			}
		}

		//getting input from user for matrix-2
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.printf("Enter the element of matrix-2 [%d][%d] :",i,j);
				b[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{

				for(int k=0;k<C1;K++)
				{
					C[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+"");
			}
			System.out.println();
		}


	}
}