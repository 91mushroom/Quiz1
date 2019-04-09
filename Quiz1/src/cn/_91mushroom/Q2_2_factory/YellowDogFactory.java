package cn._91mushroom.Q2_2_factory;

/**
 * 提供黄色狗的具体工厂
 * @author Administrator
 *
 */
public class YellowDogFactory implements AbstractFactory{

	@Override
	public AbstractDog provideDog() {
		
		return new YellowDog();
		
	}

}
