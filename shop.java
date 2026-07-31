import java.util.Scanner;
class shop
{	
	public static void main(String args[])
	{	
		char c_name,bill_date;
		int consumer_no,total_unit,bill;
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Enter consumer name :");
		c_name=sc.next().charAt(10);
		
		System.out.println("Enter bill date :");
		bill_date=sc.next().charAt(10);

		System.out.println("Enter unit :");
		total_unit=sc.nextInt();

		bill=total_unit*6+30;
		
		System.out.println("*********************");		
		System.out.println("consumer name:"+c_name);	
		System.out.println("Total unit:"+total_unit);	
		System.out.println("total bill:"+bill);		
	}
}