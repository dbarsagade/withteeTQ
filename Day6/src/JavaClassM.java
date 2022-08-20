/*create a class person 
with variables
person id,person name,age,weight
write a method  check() to check whether he is eligible to donate blood only if his age is greater than 18 and
weight is above 50.call this method in main method*/

import java.util.Scanner;
public class JavaClassM {
	    int e_id=15021;
	    String name= "Dnyaneshwar";
	    int weight=50,age=18;
	   
	     Scanner sc=new Scanner(System.in);   
	    
	    
	     /*   void calculate()
	    {
	    	if(weight>=50 && age>=18)
	    	{
	    		System.out.println(" A person is eligible to donate a blood");
	    	}
	    	else 
	    	{
	    		System.out.println(" A person is not eligible to donate a blood ");
	    	}
	    }

		 void print()
		{
			
			System.out.println("enter a person age"+age);
			System.out.println("enter a person weight"+weight);
		}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		
		JavaClassM r=new JavaClassM();
		r.calculate();
		r.print();
	}*/
	    void enterinput()
	    {
	    	System.out.println("Person id is:");
	    	e_id=sc.nextInt();
	    	System.out.println("Person name is:");
	    	name=sc.next();
	    	System.out.println("Person weight is:");
	    	weight=sc.nextInt();
	    	System.out.println("Person age is:");
	    	age=sc.nextInt();
	    	
	    }
	    void Display()
	    {
	    	System.out.println("Person id is:"+e_id);
	    	System.out.println("Person name is:"+name);
	    	System.out.println("Person weight is:"+weight);
	    	System.out.println("Person age is:"+age);
	    }
	    void calculate()
	    {
	    	if(weight>=50 && age>=18) {
	    		System.out.println("the person is eligible for donate a blood.");
	    	}
	    	else {
	    		System.out.println("the person is not eligible to donate a blood");
	    	}
	    }
	   public static void main(String[]args)
	   {
		   JavaClassM t=new JavaClassM();
		   t.enterinput();
		   t.Display();
		   t.calculate();
	   }
}