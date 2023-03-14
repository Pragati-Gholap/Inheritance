package com.jspiders.inheritance.supercallstatement;

class parent
{
	int a;
	{
		System.out.println("from MLNSI-1 of parent class");
		System.out.println(a);
		a=12;
	}
	public parent() 
	{
		
		System.out.println("from parent() constructor");
	}
	{
		System.out.println(a);
	}
}

public class child extends parent
{
	int b;
	{
		System.out.println("from MLNSI of child class");
		a=7;
		b=9;
	}
	public child() 
	{
		super()
		System.out.println("from child() constructor");
	}

	public static void main(String[] args) {
		child ch1=new child();
		System.out.println(ch1.a);
		System.out.println(ch1.b);

	}

}
