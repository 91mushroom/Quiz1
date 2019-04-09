package cn._91mushroom.Q2_2_factory;

/**
 * 抽象工厂模式
 * @author Administrator
 *
 */
public class MainFunction {
	public static void main(String[] args) {
		
		AbstractDog  yellowDog = new YellowDogFactory().provideDog();
		yellowDog.bark();
		
		AbstractDog  blackDog = new BlackDogFactory().provideDog();
		blackDog.bark();
		
	}
}
