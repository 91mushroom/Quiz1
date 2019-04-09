package cn._91mushroom.Q2_2_factory;

/**
 * 具体狗——黑色
 * @author Administrator
 *
 */
public class BlackDog implements AbstractDog{
	
	private String color = "黑色";
	@Override
	public void bark() {
		
		System.out.println(color + "狗在叫");
		
	}
}
