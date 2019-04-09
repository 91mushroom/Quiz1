package cn._91mushroom.Q2_2_factory;

/**
 * 具体狗——黄色
 * @author Administrator
 *
 */
public class YellowDog implements AbstractDog{

	private String color = "黄色";
	
	@Override
	public void bark() {
		
		System.out.println(color + "狗在叫");
		
	}

}
