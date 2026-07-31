import java.util.Scanner;
class palindrom
{
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
	
		int no,rev,temp;
		
		System.out.print("Enter the no   :");
		no=sc.nextInt();
		
		rev=0;	
		temp=no;
			
		while(no!=0)
		{
			int digit=no%10;
			rev=rev*10+digit;
			no=no/10;
		}
		if(temp==rev)
		{
		System.out.println(temp+" is palindrom");
		}
		else
		{	
		System.out.println(temp+" no IS NOT PALINDROM ");
		}		
	}
}		
