class vehical
{
	void display()
	{
		System.out.println("*************");
		System.out.println("commercial and non commercial vehicle");
	}
}
class Commercial extends vehical
{
	void display1()
	{
		super.display();
	System.out.println("buses and truks comes under this categry.");
	System.out.println("price starts  from 1000k to 10000k.");
	}
}
class Ncommercial extends vehical
{
	void display()
	{
		super.display();
		System.out.println("cars comes under this categry");
		System.out.println("price starts  from 500k to 5000k");
	}
}
public class Hierchical1 {

	public static void main(String[] args) {
		
		Ncommercial N=new Ncommercial();
		N.display();
        
	}

}
