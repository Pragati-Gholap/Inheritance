package com.jspders.inheritance.nonstaticmembers;
/*To load a non-static members using inheritance,object
  creation is mandatory for child class.If we create an
  object for child class it will load members of its own
  class and parent class.
 */
class A
{
	int a=10;
	public void test()
	{
		System.out.println("test()");
	}
	{
		System.out.println("Non-static block-A");
	}
}

public class B extends A 
{
	int b=10;
	public void demo()
	{
		System.out.println("demo()");
	}
	{
		System.out.println("non-static block-B");
	}
	

	public static void main(String[] args) {
		B obj=new B();//Object creation for child class
		System.out.println(obj.b);
		System.out.println(obj.a);
		obj.test();
		obj.demo();

	}

}
