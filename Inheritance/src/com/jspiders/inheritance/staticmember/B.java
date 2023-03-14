package com.jspiders.inheritance.staticmember;
/*During the loading process of static members using inheritance
  parent class or super class static members gets loaded first.
  Once after loading process of parent class static member is completed
  child class static member gets loaded*/
  class A
{
	static int a=10;
	public static void test()
	{
		System.out.println("test()");
	}
	static
	{
		System.out.println("SIB-A");
	}
}

public class B extends A
{
	static int b=10;
	public static void demo()
	{
	 System.out.println("demo()");
	}
	static
	{
		System.out.println("SIB-B");
	}

	public static void main(String[] args) {
		System.out.println(b);
		System.out.println(a);
		demo();
		test();
		

	}

}
