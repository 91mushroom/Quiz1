package cn._91mushroom.Q2_3;

/**
 * 观察者模式
 * @author Administrator
 *
 */
public class MainFunction {
	
	public static void main(String[] args) {
		
		InputerObserver inputerObserver = new InputerObserver();
		Inputer inputer = new Inputer();
		inputer.add(inputerObserver);
		while(true) {
			inputer.getInputInfo();
		}
	}
}
