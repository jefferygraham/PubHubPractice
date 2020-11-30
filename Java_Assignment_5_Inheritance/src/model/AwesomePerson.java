package model;

public class AwesomePerson extends Person {
	
	public AwesomePerson() {
		this.name = "Jeff";
		this.age = 42;
		
		System.out.println("In AwesomePerson default constructor");
	}
	
	public void talk() {
		System.out.println("My name is " + this.name + " and I'm " + this.age + " years old. ");
	}

}
