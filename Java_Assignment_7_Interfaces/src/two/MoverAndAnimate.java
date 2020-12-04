package two;

public class MoverAndAnimate implements Animatable {
	
	@Override
	public void move() {
		System.out.println("M&M vroom");
	}
	
	@Override
	public void animate() {
		System.out.println("M&M animate");
	}
}
