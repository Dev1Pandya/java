import java.util.Scanner;
class check
{
	public static void main(String args[])
	{	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no to check even or odd:");
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("Given NUmber "+num+"is Even":);
	}
	else
	{	
		System.out.println("Given Number "+num+"is odd");
	}
	}
}