package cn._91mushroom.Q2_1;
 
/**
 *单例模式——懒汉模式
 * @author Administrator
 *
 */
public class Singleton_one {
	
	private static Singleton_one singleton_one = null;
	
	private Singleton_one() {}
	
	public static Singleton_one getInstance() {
		
		if (singleton_one ==null) {
			synchronized (Singleton_one.class) {
				if (singleton_one == null) {
					singleton_one = new Singleton_one();
				}
			}
		}
		
		return singleton_one;
	}

}
