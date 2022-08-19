class Animal1
{  
  void eat()
    {
	 System.out.println("eating...");
	}  
}  
class Dog extends Animal1 
{  
     void bark()
     {
	 System.out.println("barking...");
	 }  
}  
class Cat extends Animal1
{  
   void meow() 
       {
	   System.out.println("meowing...");
	   }  
}  

public class Hierchical2 {

	public static void main(String[] args) {
		Cat c=new Cat();  
		c.meow();  
		c.eat();  

	}

}
