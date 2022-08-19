class company1
{
	void display()
	{
		System.out.println("company manufature mobile phones");
	}
}
class redmi extends company1
{
	void display()
	{
		super.display();
		System.out.println("company manufacture 10k to 100k budget phones");
	}
}

class galaxy extends redmi
{
	void display()
	{
		super.display();
		System.out.println("M series phone is a mid side segment phones ");
		System.out.println("Galaxy is flag ship series phones");
	}
}
public class Multiple3 {

	public static void main(String[] args) {
		galaxy g= new galaxy();
		g.display();
				
		

	}

}
