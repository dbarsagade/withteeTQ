import java.util.Scanner;

public class PallintronLe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,sum=0,n;
		System.out.println("enter a number");
		n=sc.nextInt();
		int temp=n;
		loop1: for(int i=0;i<5;i++) {
			
			loop2: for(int j=i;j<=i;j++) {
				
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
				if(temp == sum)
					System.out.println("NO. is Palindrome");
				else
					System.out.println("NO. is not palindrome");
				continue loop1;
			}
		//	if(temp == sum)
			//	System.out.println("NO. is Palindrome");
		//	else
		//		System.out.println("NO. is not palindrome");
		//	continue loop1;
		}
			
		

	}

}
