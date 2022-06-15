package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	private Heart h;
	//Default constructor
	public Human() 
	{
		this.h= h;
    }
	
	//DI  using constructor 
	public Human(Heart h) {
		super();
		this.h = h;
	}

	//DI using setter
	@Autowired
	@Qualifier("humanHeart")
	public void setH(Heart h) {
		this.h = h;
	}

	public void display()
	{
		h.print();
		System.out.println("The name of animal is :"+ h.getNameOfAnimal()+ " and no of heart is : "+h.getNoOfHeart() );
	}

	
}
