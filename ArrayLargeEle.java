import java.util.Scanner;
class ArrayLargeEle
{
	public static void main(String args[])
	{
		int []num={45,67,-45,20,22};
		int large=num[0];
		for(int temp:num)
		{	if(large<temp)
				large=temp;
		}	
		System.out.println("The largest Element of array is: "+large);
	}
}