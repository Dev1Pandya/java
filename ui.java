import java.util.Scanner;
class ui
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		
		
		int ch;		
		

		System.out.println("Enter your choice for mon(1-12):");
		ch=sc.nextInt();
	
		switch(ch)
		{
			case 1:System.out.println("JAN");
				break;
			case 2:System.out.println("FEB");
				break;
			case 3:System.out.println("MAR");
				break;
			case 4:System.out.println("APRIL");
				break;
			case 5:System.out.println("MAY");
				break;
			case 6:
				System.out.println("JUNE");
				break;
			case 7:
				System.out.println("JULY");
				break;
			case 8:
				System.out.println("AUGUST");
				break;
			case 9:
				System.out.println("SEPT");
				break;
			case 10:System.out.println("OCT");
				break;
			case 11:
				System.out.println("NOV");
				break;
			case 12:
				System.out.println("DEC");
				break;

			default case:System.out.println("Enter proper choice..");
		}
	}
}