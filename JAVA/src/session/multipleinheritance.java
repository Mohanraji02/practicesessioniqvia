package session;

public class multipleinheritance {
	
	
	
	public static void main(String [] s)
	{
main12 x=new main12();
x.display();
x.display1();
x.display2();
}}
	
	interface one
	{
		public void display();
	}
	
	interface two
	{
		
		public void display1();
	}
	
	interface three extends one,two
	{
		public void display2();
	}
	
	class main12 implements three
	{
		public void display()
		{
			
			System.out.println("mohan");
		}

		@Override
		public void display1() {
			
			System.out.println("mohan1");
		}

		@Override
		public void display2() {
		
			System.out.println("mohan2");
		}
	
}