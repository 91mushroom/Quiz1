package cn._91mushroom.Q2_2_builder;

/**
 *指挥者
 * @author Administrator
 *
 */
public class Director {
	private IBuilder builder;
	
	public Director(IBuilder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.addMainBoard("华硕Z370");
		builder.addCpu("i7");
		builder.addGpu("RTX2080Ti");
		builder.addMemory("16GB");
	}
	
}
