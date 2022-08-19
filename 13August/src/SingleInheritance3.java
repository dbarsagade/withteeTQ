class bus
{
	void name()
	{
		System.out.println("VRL logistics");
		
	}
}

class ticket extends bus
{
	void price()
	{     super.name();
		int price=550;
		System.out.println("ticket price is "+price);
		System.out.println("Route from Nagpur to pune");
	}
}
	

public class SingleInheritance3 {

	public static void main(String[] args) {
		ticket t=new ticket();
		t.price();
		
		

	}

}
