import java.util.Scanner;
class Matrixmul                      
{
	public static void main(String args[])
	{
		int r1,r2,c2,c1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of row for matrix-1:");
		r1=sc.nextInt();

		System.out.println("Enter no of column for matrix-1:");
		c1=sc.nextInt();

		System.out.println("Enter no of row for matrix-2:");
		r2=sc.nextInt();

		System.out.println("Enter no of column for matrix-2:");
		c2=sc.nextInt();	

		int[][]a=new int[r1][c1];
		int[][]b=new int[r2][c2];
		int[][]c=new int[r1][c2];

		if(c1!=r1)
		{
				System.out.print("Matrix is not possible");
				return;
		}

		//Gettingin value of Matrix 1

		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{	
				a[i][j]=sc.nextInt();
			}
		}

		//Gettingin value of Matrix 2

		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		// Multiplication 
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
				{
				c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}