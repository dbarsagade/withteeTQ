/*
 create class airlines
with variables
airlinename,citytoboard,citytoreach,fare
create a method show() to display all the details
*/
 
public class Airline {
	    int fare=55000;
        String name=" Air India";
        String citytoboard="New Delhi";
        String citytoreach="Sanfrancisco";
        
        void Display()
        {
        	System.out.println("Your journey fare is : " +fare);
        	System.out.println("Airline name is :" +name);
        	System.out.println("Bording City Name :" +citytoboard);
        	System.out.println("Reach distination is :" +citytoreach);
        }
        
	public static void main(String[] args) {
		Airline e=new Airline();
		//e.fare=55000;
		e.Display();
		
	}

}
