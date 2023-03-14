package com.jspiders.inheritance.types;
//Single level inheritance
/*If the inheritance is for one level,then such type of iheritance
 is called single level inheritance. 
 */

class parent
{
	int a=10;
}
class child extends parent 
{
	int b=20;
}
public class Driver2 {

	public static void main(String[] args) {
		child ch=new child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		parent p=new parent();
		System.out.println(p.a);
		//System.out.println(p.b);
		/*CTE(Using parent class reference variable we cannot
		 access child class member */

	}

}
