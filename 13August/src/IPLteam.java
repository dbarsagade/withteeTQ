//Create class IPLTeam with method play. Create child classes of IPLTeam
//called as CSK, RCB. In main, call play from child class objects.
class IPL
{
	void play()
	{
		System.out.println("total player is 11");
		System.out.println("***Season 2022***");
	}
	
}
class CSK extends IPL
{
	void show()
	{
		super.play();
		System.out.println(" csk captain is M.S.Dhoni");
		System.out.println("Team t shirt colour is yellow");
		
	}
}
class RCB extends IPL
{
	void display()
	{
		super.play();
		System.out.println("RCB captain is Virat kohli");
		System.out.println("Team t shirt is Red");
	}
}
public class IPLteam {

	public static void main(String[] args) {
		
		RCB p=new RCB();
		CSK c= new CSK();
		
		p.display();
		c.show();
	}

}
