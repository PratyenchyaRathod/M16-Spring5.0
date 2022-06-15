package com.cg.di;

public class Student {
	private String Name;
	private int Id;
	//DI using constructors
	public void print()
	{
		System.out.println("The student Name is "+Name);
		System.out.println("The student Id is "+Id);
	}
	public Student(String name, int id) {
		super();
		Name = name;
		Id = id;
	}

	
	//DI using setters
	/*public void setName(String name) {
		Name = name;
	}
	

	public void setId(int id) {
		Id = id;
	}
*/

	
}
