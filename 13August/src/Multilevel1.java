class car
{
	void display()
	{
		System.out.println("car");
	}
}
 class tata extends car
 {
	 void display()
	 {
		 super.display();
		 System.out.println("car company tata");
		 System.out.println("company manufature SUV,HATCHBACK,SEDAN");
	 }
 }
class safari extends tata
{
	void display()
	{
		super.display();
		int price=2000000;
		System.out.println("car price is "+price);
		System.out.println("car colour black");
	}
}
public class Multilevel1 {
	

	public static void main(String[] args) {
		
		safari s=new safari();
		s.display();

	}

}
