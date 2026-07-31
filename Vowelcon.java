import java.util.Scanner;
class Vowelcon
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter the Character to check Vowel or consonant:");
		ch=sc.next().charAt(0);

		if(ch=='A'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o')
		{
			System.out.println(ch+"is vowel");
		}
		else
		{
			System.out.println(ch+"is consonant");

		}
	}
}