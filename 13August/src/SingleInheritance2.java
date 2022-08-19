class Mobile
{
	
	void charger()
	{
		System.out.println("Type C chager ");
	}
}
class samsung extends Mobile
{   
	void name()
	{
		super.charger();
		System.out.println("Samsung");
		float price=25000f;
		System.out.println(price+25000+" mobile price  ");
		System.out.println("camera 50MP");
	}
}
public class SingleInheritance2 {

	public static void main(String[] args) {
		
		samsung s=new samsung();
		//s.charger();
		s.name();
		
		
	}

}
