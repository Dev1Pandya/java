import java.util.Scanner;
class circle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double r,pi=3.14,area;
		

		
		System.out.println("Enter value of radious of area:");
		r=sc.nextDouble();
		r=sc.nextDouble();
	
		area=pi*r*r;

		System.out.println("******************************");
		System.out.println("The value of PI is :"+pi);
		System.out.println("The value of R is :"+r);
		System.out.println("The value of si is :"+area);
		System.out.println("******************************");

	}
}