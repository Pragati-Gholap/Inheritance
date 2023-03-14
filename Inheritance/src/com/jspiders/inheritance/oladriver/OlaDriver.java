package com.jspiders.inheritance.oladriver;

class Ola
{
	String starting;
	String destination;
	Ola(String start,String End)
	{
		this.starting=start;
		this.destination=End;
	}
}
class Bike extends Ola
{
	double price=5;
	 Bike(String start,String End) 
	 {
	  super(start, End);
	}

public void getBikeAttribute()
{
	System.out.println("starting point:"+this.starting);
	System.out.println("destination point:"+this.destination);
	System.out.println("cost per km:"+this.price);
}
}
class Auto extends Ola
{
	double price=10;
	public Auto(String start,String End)
	{
		super(start,End);
	}
	public void getAutoAttribute()
	{
		System.out.println("starting point:"+this.starting);
		System.out.println("destination point:"+this.destination);
		System.out.println("cost per km:"+this.price);
	}
}


public class OlaDriver {

	public static void main(String[] args) {
		Auto al=new Auto("Wakad","Deccan");
		al.getAutoAttribute();
		System.out.println("------------------");
		Bike b1=new Bike("Wakad","Deccan");
		b1.getBikeAttribute();
	

	}

}
