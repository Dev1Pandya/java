import java.util.Scanner;
class Revno
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
		System.out.print("old no  :"+temp);
		System.out.print("new     :"+rev);
	}
}		
