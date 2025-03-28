import java.util.Scanner;
class Ex04{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a letter:");
		char x=sc.next().charAt(0);
		switch(x)
		{
			case 'a':System.out.println("It is vowel");
			         break;
			case 'e':System.out.println("It is vowel");
			         break;
			case 'i':System.out.println("It is vowel");
			         break;
			case 'o':System.out.println("It is vowel");
			         break;
			case 'u':System.out.println("It is vowel");
			         break;
					 
			case 'A':System.out.println("It is vowel");
			         break;
			case 'E':System.out.println("It is vowel");
			         break;
			case 'I':System.out.println("It is vowel");
			         break;
			case 'O':System.out.println("It is vowel");
			         break;
			case 'U':System.out.println("It is vowel");
			         break;
			default:System.out.println("It is not vowel");
		}
	}
}
		