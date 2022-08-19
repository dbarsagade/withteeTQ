class fruits
{
	void colour()
	{
		System.out.println("Orange");
	}
}
class Apple extends fruits
{
	void display()
	{   super.colour();
		System.out.println("Apple colour is Red");
		System.out.println("test sweet");
	}
}
class orange extends fruits
{
	void test()
	{
		super.colour();
		System.out.println("salty");
	}
}
public class Hierchical3 {

	public static void main(String[] args) {
		orange o=new orange();
		//o.colour();
		o.test();
		

	}

}
