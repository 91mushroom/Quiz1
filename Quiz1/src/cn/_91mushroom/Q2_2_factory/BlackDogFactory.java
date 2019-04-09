package cn._91mushroom.Q2_2_factory;

/**
 *提供黑色狗的具体工厂
 * @author Administrator
 *
 */
public class BlackDogFactory implements AbstractFactory{

	@Override
	public AbstractDog provideDog() {
		return new BlackDog();
	}

}
