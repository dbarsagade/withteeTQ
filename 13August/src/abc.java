
public class abc {

	public static void main(String[] args) {
		//21546
		int a=21546;
		int firstdigit=0;
		int lastdigit=0;
		lastdigit=a%10;
		System.out.println("print the value of last two digits:");
		while(a!=0) {
			firstdigit=a%10;
			a/=10;
			
		}
		
	System.out.println("first digit:"+firstdigit);
	System.out.println("last digit:"+lastdigit);
	int add=lastdigit+firstdigit;
	System.out.println("add " +add);
	

	}

}
