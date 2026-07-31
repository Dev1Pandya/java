import java.util.Scanner;
class characterAscii
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Alphabets and their ASCII values...");
		char ch;                   
		for(ch='a';ch<='z';ch++)
			
			System.out.print(ch+ " = " + (int)ch + " ");
	}
}
	