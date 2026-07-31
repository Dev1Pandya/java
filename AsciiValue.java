import java.util.Scanner;
class AsciiValue
{
	public static void main(String args[])
	{	
	Scanner sc=new Scanner(System.in);
	char ch;
System.out.println("Enter the Character to print Ascii Value");
	ch=sc.next().charAt(0);
	int ascii=ch;
System.out.println("the ascii vlaue of"+ch+"is"+ascii );
	}
}	