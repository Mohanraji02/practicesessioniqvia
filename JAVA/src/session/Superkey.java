package session;

public class Superkey {

	
	
	public static void main(String[] s)
	{
		car c=new car();
		c.display1();
		c.display();
		
		
	}
}



class vechicle
{
	int max=100;
	public void display()
	{
		System.out.println(max*10);
	}
	
}

class car extends vechicle
{
	
	int max=300;
	
	public void display1()
	{
		
		System.out.println("price"+super.max);
		
		
	}
}