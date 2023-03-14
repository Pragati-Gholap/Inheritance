package com.jspiders.inheritance.types;
//Hierarchical inheritance
/*If parent class have more than one child at the same level
 *is called as Hierarchical inheritance
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
		System.out.println("barking");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("meowing....");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.meow();
		//c.bark()//CTE

	}

}
