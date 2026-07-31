import java.util.Scanner;
class FindAverge
{
	public static void main(String args[])
	{
		double []num={45.3,67.5,-45.6,20.34,22.0}
		double sum=0.0;
for(double temp:num)
{
	sum=sum+temp;
}
double average=sum/num.length;
System.out.pritln("")