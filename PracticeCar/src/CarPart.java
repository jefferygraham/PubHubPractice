
abstract public class CarPart implements Functional {
	
	public  int condition;
	
	public CarPart(int condition) {
		this.condition = condition;
	}
	
	public void lowerCondition() {
		this.condition--;
	}
	
	@Override
	public void function() {
	
	}
	
	abstract void status();

}
