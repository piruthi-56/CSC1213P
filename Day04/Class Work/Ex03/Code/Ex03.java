import java.util.Scanner;
class Ex03{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int evencount=0;
        int oddcount=0;		
		char Control=' ';
		int evensum=0;
		int oddsum=0;
		do{
	
            System.out.print("Enter the number to find summation:");
            int a=sc.nextInt();
			if(a%2==0)
			{
				evensum=evensum+a;
				evencount++;
			}
			else
			{
				oddsum=oddsum+a;
				oddcount++;
			}
			
		
		    System.out.print("Do you want to continue(Y/N):");
		    Control=sc.next().charAt(0);
		}while(Control=='Y');
			System.out.println("Count the even numbers:"+evencount);
			System.out.println("Count the odd numbers:"+oddcount);
			System.out.println("Sum of the even numbers:"+evensum);
			System.out.println("Sum the odd numbers:"+oddsum);
				
    }
}		
				