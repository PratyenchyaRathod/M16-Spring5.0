package com.cg.ioc;

public class Airtel implements Sim
{
   public Airtel()
   {
	   System.out.println("Airtel constructor is called..");
   }
	public void calling() {
		System.out.println("Airtel calling");
	}

	public void data() {
		System.out.println("Airtel Data Pack");
		
	}
	

}
