class Animal
{
	void display()
	{
		System.out.println("Domastic animal have  four legs");
	}
}
class cow extends Animal
{
	void display()
	{
		super.display();
		System.out.println("cow colour is white");
	}
}
class cow2 extends cow
{
	void display()
	{
		super.display();
		System.out.println("cow milk is healthy. ");
	}
}
public class Multiilevel2 {

	public static void main(String[] args) {
		cow2 c=new cow2();
		c.display();
	}

}
