import java.util.Scanner;
class userinput
{
	public static void main(String args[])
	{
		String sname;
		int rno;
		float per;
		long  mnum;
		char ch;
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter your name:");
		sname=sc.nextLine();
		
		System.out.println("Enter rollno::");
		rno=sc.nextInt();
		
		System.out.println("Enter per:");
		per=sc.nextFloat();

		System.out.println("Enter Mobile:");
		mnum=sc.nextLong();

		System.out.println("Enter gender(M/F):");
		ch=sc.next().charAt(0);		

		System.out.println("**********************");
		System.out.println("name:"+sname);
		System.out.println("rno:"+rno);
		System.out.println("per:"+per);
		System.out.println("Mobile :"+mnum);
		System.out.println("Gender is:"+ch);
		System.out.println("**********************");
	
	}
}