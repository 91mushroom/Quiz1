package cn._91mushroom.Q2_2_builder;

/**
 * builder设计模式
 * @author Administrator
 *
 */
public class MainFunction {
	public static void main(String[] args) {
		
		IBuilder builder = new ComputerBuilder();
		Director director =  new Director(builder);
		director.construct();
		Computer computer = builder.getComputer();
		
		System.out.println(computer);
	}
}
