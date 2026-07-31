import java.util.Scanner;
class triangleArea 
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double width,height,area;
		System.out.println("Enter the Value of Width:");
		width=sc.nextDouble();
		System.out.println("Enter the Value of height:");
		height=sc.nextDouble();

		area=(width*height)/2.0;

		System.out.println("The area of teh triangle is :"+area);

	}	
}
