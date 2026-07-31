import java.util.Scanner;
class simplein
{	
	public static void main(String args[])
	{
		float p,r,n,si;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter value of p:");
		p=sc.nextFloat();
		
		System.out.println("Enter value of R:");
		r=sc.nextFloat();

		System.out.println("Enter value of N(Duration):");
		n=sc.nextFloat();
		si=(p*r*n)/100;
				
		System.out.println("******************************");

		System.out.println("The value of p is :"+p);
		System.out.println("The value of r is :"+r);
		System.out.println("The value of n is :"+n);
		System.out.println("The value of si is :"+si);
		System.out.println("******************************");


		
	}
}