package cn._91mushroom.Q2_2_builder;

/**
 * 具体电脑组装类
 * @author Administrator
 *
 */
public class ComputerBuilder implements IBuilder{

	private Computer computer = new Computer();
	

	@Override
	public void addCpu(String cpuName) {
		
		computer.setCpu(cpuName);
	}

	@Override
	public void addGpu(String gpuName) {

		computer.setGpu(gpuName);
	}

	@Override
	public void addMainBoard(String mainBoardName) {

		computer.setMainBoard(mainBoardName);
	}

	@Override
	public void addMemory(String memoryName) {

		computer.setMemory(memoryName);
	}
	
	@Override
	public Computer getComputer() {
		return computer;
	}
}
