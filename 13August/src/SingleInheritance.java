

class  emp 
{
void Display()
  {
    System.out.println("salary..."+(50000));
  }
}
class company extends emp
{
    void Display ()
    {
        super.Display();
        System.out.println("bounse...."+(5000));
    }
}
public class SingleInheritance
{
	public static void main(String[] args) {
	    company c=new company();
	    c.Display();
	
	}
}

