package com.jspiders.inheritance.supercallstatement;

class A1
{
	int a;
	int b;
	A1(int var1,int var2)
	{
		this.a=var1;
		this.b=var2;
	}
}

public class B1 extends A1
{
	int c;
	public B1(int var1,int var2,int var3)
	{
		super(var1, var2);
		this.c=var3;
	}

	public static void main(String[] args) {
		B1 b1=new B1(10, 20,30);
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);

	}

}
