import java.util.Scanner;
public class Ex01{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] Number=new int[5];
		int sum=0;
		for(int i=0;i<5;i++){
		System.out.print("Enter the 5 number:");	
		Number[i]=sc.nextInt();
		sum=sum+Number[i];
		}
		System.out.println("Sum is:"+sum);
	}
}

		
	

		
		
		
		
		
		
		
		
		
		