package cn._91mushroom.Q2_2_builder;

public class Computer {
	private String cpu;
	private String gpu;
	private String mainBoard;
	private String memory;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getMainBoard() {
		return mainBoard;
	}
	public void setMainBoard(String mainBoard) {
		this.mainBoard = mainBoard;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", gpu=" + gpu + ", mainBoard=" + mainBoard + ", memory=" + memory + "]";
	}

	

}
