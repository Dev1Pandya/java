import java.util.Scanner;
class switchcal
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		float res=0;
		float n1,n2;
		char ch;		
		System.out.println("Enter the value of N1:");
		n1=sc.nextFloat();
		
		System.out.println("Enter the value of n2:");
		n2=sc.nextFloat();

		System.out.println("Enter your choice (+,-,*,/):");
		ch=sc.next().charAt(0);
	
		switch(ch)
		{
			case '+':res=n1+n2;
				break;
			case '-':res=n1-n2;
				break;
			case '*':res=n1*n2;
				break;
			case '/':res=n1/n2;
				break;
			case '%':res=n1%n2;
				break;
			default:System.out.println("Enter proper choice...");
				break;
		}
		System.out.printf("%.2f		%c	%.2f=%.2f	",n1,ch,n2,res);
	}
}
		