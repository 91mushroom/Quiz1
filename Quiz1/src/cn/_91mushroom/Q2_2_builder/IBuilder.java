package cn._91mushroom.Q2_2_builder;

/**
 * 抽象电脑组准类
 * @author Administrator
 *
 */
public interface IBuilder {
	void addCpu(String cpuName);
	void addGpu(String gpuName);
	void addMainBoard(String mainBoardName);
	void addMemory(String memoryName);
	Computer getComputer();
}
