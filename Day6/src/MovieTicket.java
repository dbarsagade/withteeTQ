/*
 create class theatre with variables 
theatre_name,movie_name,ticket_price,coupon
create a method calculatePrice() which display if he has coupon as gold he vl get 10% discount
on ticket price if he has platinum he vl get 7% disvount and if he has silver 5% discount.and if he 
does not have coupon no discount.Display entire details with ticket fare.
 */
import java.util.Scanner;

public class MovieTicket {

	
		String theatere_name;
		String movie_name;
		int T_P;
		//String coupon;
		int gold=10;
		int platinum=7;
		int silver=5;
		int no_coupon=1;
		float D1,D2,D3,D4;
		//float x;
		
		Scanner sc=new Scanner(System.in);
		
         void Display()
         {
        	
        		System.out.println("plz enter theater name"+theatere_name); 
        		theatere_name=sc.next();
        		System.out.println("plz enter theater name"+movie_name); 
        		movie_name=sc.next();
        		System.out.println("plz enter theater name"+T_P); 
        		T_P=sc.nextInt();
        		//System.out.println("plz enter theater name"+coupon); 
        		//coupon=sc.next();
        	    System.out.println("plz enter coupon details:");
        	    gold=sc.nextInt();
        	    platinum=sc.nextInt();
        	    silver=sc.nextInt();
        	    no_coupon=sc.nextInt();
        	    
         }
         void calculate()
         {
        	D1=(T_P*gold)/100;
        	D1=sc.nextFloat();
        	D2=(T_P*platinum)*100;
        	D2=sc.nextFloat();
        	D3=(T_P*silver)*100;
        	D3=sc.nextFloat();
        	D4=(T_P*no_coupon);
        	D4=sc.nextFloat();
        		
         }
         void Print()
         {
        	// If(x=D1)
        	 System.out.println("you got 10% discount you have to pay:"+D1);
        	 System.out.println("you got 7% discount you have to pay:"+D2);
        	 System.out.println("you got 5% discount you have to pay:"+D3);
        	 System.out.println("you got no discount you have to pay:"+D4);
         }
         
	

    public static void main(String[] args) {
    	 MovieTicket r=new  MovieTicket() ;
    	 r.Display();
    	 r.calculate();
    	 r.Print();
	
 }
}