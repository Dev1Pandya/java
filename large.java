import java.util.Scanner;
class large
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no1,no2,no3;
		System.out.println("Eneter the value of no 1");
		no1=sc.nextInt();
		System.out.println("Eneter the value of no 2");
		no2=sc.nextInt();
		System.out.println("Eneter the value of no 3");
		no3=sc.nextInt();
		

		if(no1>=no2 && no1>=no3)
			System.out.println(no1+"is the largest number..");
		else if(no2>=no1 && no2>=no3)
			System.out.println(no2+"is the largest number..");
		else
			System.out.println(no3+"is the largest number..");
	}
}