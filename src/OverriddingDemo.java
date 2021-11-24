class A
{
	public void show()
	{
		System.out.println("in A");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B");
	}

}

public class OverriddingDemo {

	public static void main(String[] args) 
	{
		A obj1 = new B();
		obj1.show();

	}

}
