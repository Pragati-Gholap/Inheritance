package com.jspiders.inheritance.supercallstatement;
//Supercall statement it is used to call constructor of its parent class
/*To call no argument constructor of parent class,writing supercall statemen
 *of no argument type is not mandatory inside child class
 *constructor(it gets added automatically)
 */
class A
{
	int a=10;
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	int b=20;
	B()
	{
		System.out.println("B()");
	}
}
class C extends B
{
	int c=30;
	C()
	{
		System.out.println("c()");
	}
}
class d extends C
{
	int d=40;
	d()
	{
		System.out.println("d()");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		d obj=new d();
		System.out.println(obj);

	}

}
