package cn._91mushroom.Q2_1;
 
/**
 *单例模式——饿汉模式
 * @author Administrator
 *
 */
public class Singleton_two {
	
	private static Singleton_two singleton_two = new Singleton_two();
	
	private Singleton_two() {}
	
	public static Singleton_two getInstance() {
		
		return singleton_two;
	}

}
