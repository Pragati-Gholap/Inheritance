package com.jspiders.inheritance.types;
//Multiple inheritance

/*If a child class have more than one parent at the same level
 *is known as multiple inheritance
 */
 class A
 {
	 void msg()
	 {
		 System.out.println("Hello");
	 }
 }
 class B extends A
 {
	 void msg()
	 {
		 System.out.println("welcome");
	 }
	 
 }
 class C extends A,B
 {
	 void msg()
	 {
	System.out.println("hii"); 
     }
 }

public class MultipleInheritance {

	public static void main(String[] args) {
		C c1=new C();
		c1.msg();//Now which msg() method would be invoked?
/*Multiple inheritance is not applicable for class in java.
 * because of diamond problem.
 */
	}

}
