import java.util.ArrayList;
import java.util.List;

public class Car {
	
	List<CarPart> parts = new ArrayList<>();
	
	public Car(int numWheels, int numcylinders, int condition) {
		Engine engine = new Engine(numcylinders, condition);
		parts.add(engine);
		
		Wheel wheels = new Wheel(numWheels, condition);
		parts.add(wheels);
	}
	
	public void run() {
		for (int i = 0; i < parts.size(); i++){
			parts.get(i).function();
			parts.get(i).status();			
		}
	}
	
	
}