import java.util.Scanner;
class table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int no,i;

		System.out.println("Eneter value of no:");
		no=sc.nextInt();

		for(i=1;i<=10;i++)
		{
		
			System.out.printf("%d * %d = %d\n",no,i,(no*i));
		}
	}
}