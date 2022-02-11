//import ArrayList
import java.util.ArrayList;

//Dog generic parent class with year of birth and name
class Dog{
	public String name;
	public int yob;
	public Dog(String name, int yob){
		this.name = name;
		this.yob = yob;
	}
	
	//eat, sleep, bark, and toString functions print out variables and Strings
	public void eat(){
		System.out.println("I'm eating rn");
	}
	
	public void sleep(){
		System.out.println("I'm sleeping rn");
	}
	
	public void bark(){
		System.out.println("Woof woof");
	}
	
	public String toString(){
		return ("Hi my name is " + name + " and I was born in " + yob + ".");
	}
}

//child class BassetHound has special variable inchEarLength which is the length of its ear
class BassetHound extends Dog{
	int inchEarLength;
	public BassetHound(String name, int year, int inchEarLength){
		super(name, year);
		this.inchEarLength = inchEarLength;
	}
	
	public void bark(){
		System.out.println("WUF WUF");
	}
	
	//can hear diff db based on ear length
	public void hear(){
		System.out.println("I can hear sounds as quiet as " + (float)1/inchEarLength + "db.");
	}
	
	public String toString(){
		return ("Hi my name is " + super.name + " and I was born in " + super.yob + ". I also have an ear length of " + inchEarLength + "in.");
	}
}

//child class GreyHound has special variable mphSpeed which is its run speed
class GreyHound extends Dog{
	int mphSpeed;
	public GreyHound(String name, int year, int mphSpeed){
		//super method
		super(name, year);
		this.mphSpeed = mphSpeed;
	}
	public void bark(){
		System.out.println("ZANG ZANG");
	}
	
	//prints how fast it can run
	public void runFast(){
		System.out.println("I can run as fast as " + mphSpeed + " mph. Zoooooooooooom!");
	}
	
	public String toString(){
		return ("Hi my name is " + super.name + " and I was born in " + super.yob + ". I also have run speeed of " + mphSpeed + "mph.");
	}
}

//Tester class that has all dogs 
public class TesterDog{
	public static void main(String args[]){
		Dog d1 = new Dog("Rocco", 2008);
		Dog d2 = new Dog("Lucky", 2009);
		BassetHound b1 = new BassetHound("Doug", 1999, 12);
		BassetHound b2 = new BassetHound("Hugh", 2003, 5);
		GreyHound g1 = new GreyHound("Sparky", 2005, 28);
		GreyHound g2 = new GreyHound("Flash", 2010, 40);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(d1);
		dogs.add(d2);
		dogs.add(b1);
		dogs.add(b2);
		dogs.add(g1);
		dogs.add(g2);
		
		System.out.println("Dogs before the switcharoo: ");
		
		for(int i = 0; i<dogs.size(); i++){
			System.out.println(dogs.get(i).toString());
		}
		
		System.out.println("\n\n\n\nDogs after the switcharoo: ");
		//switches the order with ArrayList methods
		dogs.remove(d1);
		dogs.add(2,d1);
		dogs.set(0, g1);
		dogs.remove(0);
		dogs.add(d2);
		dogs.remove(3);
		dogs.add(g1);

		
		for(int i = 0; i<dogs.size(); i++){
			System.out.println(dogs.get(i).toString());
		}
	}
}


