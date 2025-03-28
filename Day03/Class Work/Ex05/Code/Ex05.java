import java.util.Scanner;
class Ex05{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number:");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++){
			System.out.print(i+"\t");
		}
	}
}