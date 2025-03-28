import java.util.Scanner;
class Ex01{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		
		if (a==0)
		{
			System.out.println("It is equal to zero");
		}
		else if(a>0)
		{
			System.out.println("It is a positive number");
		}
		else
		{
		    System.out.println("It is a negative number");
		}
	}
}