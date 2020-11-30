package main;

import model.AwesomePerson;
import model.ReallyAwesomePerson;

public class Application {

	public static void main(String[] args) {

		AwesomePerson jeff1 = new AwesomePerson();
		jeff1.talk();
		
		ReallyAwesomePerson jeff2 = new ReallyAwesomePerson();
		jeff2.talk("really");

	}

}
