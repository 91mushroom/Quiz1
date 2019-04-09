package cn._91mushroom.Q2_3;

/**
 * 输入类观察者
 * @author Administrator
 *
 */
public class InputerObserver implements IObserver {

	@Override
	public void update(String info) {
		
		System.out.println("输入的信息是：" + info);
		
	}
	
}
