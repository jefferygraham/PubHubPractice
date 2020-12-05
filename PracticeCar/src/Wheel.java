
public class Wheel extends CarPart{
	
	int numWheels;
	
	public Wheel(int numWheels, int condition){
		super(condition);
		this.numWheels = numWheels;
	}

	@Override
	public void function() {
		System.out.println("This car has " + this.numWheels + " wheels.");
	}

	@Override
	public void status() {
		System.out.println("The wheels are at " + this.condition + ".");		
	}
	

}
