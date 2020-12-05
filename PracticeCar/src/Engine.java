
public class Engine extends CarPart{
	
	int numCylinders;
	
	public Engine(int numCylinders, int condition){
		super(condition);
		this.numCylinders = numCylinders;
	}

	@Override
	public void function() {
		System.out.println("This engine has " + this.numCylinders + " cylinders.");
	}

	@Override
	public void status() {
		System.out.println("This engine is at " + this.condition + ".");		
	}
	

}