package com.jspiders.inheritance.types;
//Multi-level inheritance
/*if the inheritance is for more than one level then such
 * type of inheritance is called as multi-level inheritance.
 */
class Animal
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking...");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("weeping...");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.eat();
		d1.bark();
		//d1.weep()//CTE
		System.out.println("----------------");
		BabyDog b1=new BabyDog();
		b1.eat();
		b1.bark();
		b1.weep();

	}

}
