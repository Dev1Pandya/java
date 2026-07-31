import java.util.Scanner;
class addition
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n1,n2,sum,sub,mul,div;
		
		System.out.println("Enter the value of N1:");
		n1=sc.nextInt();
		
		System.out.println("Enter the value of n2:");
		n2=sc.nextInt();

		sum=n1+n2;
		sub=n1-n2;
		mul=n1*n2;
		div=n1/n2;

		System.out.println("******************************");
		System.out.println("the Addition of N1+N2 is:"+sum);
		System.out.println("The Subtraction of N1-N2 is:"+sub);
		System.out.println("The Multiplication of N1-N2 is:"+mul);
		System.out.println("The Division of N1-N2 is:"+div);
		System.out.println("******************************");

	}
}