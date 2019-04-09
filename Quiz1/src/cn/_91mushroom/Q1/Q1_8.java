package cn._91mushroom.Q1;

/**
 * 用循环同时启动10个线程，每一个线程在屏幕上打印一条包含自己标识的文本信息 
 *多次运行该程序，观察打印的文本信息是否与该线程启动的顺序完全一致？ 如果不一致，如何做到让信息打印的顺序与线程启动的顺序一致？
 * @author H.H
 *
 */
public class Q1_8 extends Thread{
	
	private Integer mark;
	private LockObject lockObject;
	
	public Q1_8(Integer mark, LockObject lockObject){
		this.mark = mark;
		this.lockObject = lockObject;
	}
	
	@Override
	public  void run() {
		synchronized(lockObject){
			while(true){
				if(lockObject.order == mark){
					System.out.println(Thread.currentThread().getName());
					lockObject.order += 1;
					lockObject.notifyAll();
					break;
				}else{
					try {
						lockObject.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		}
		
	}
	  
	 
	public static void main(String[] args) {
		LockObject lockObject = new LockObject();
		for (int i = 0; i < 10; i++){
			new Q1_8(i, lockObject).start();
		}
	}
}

class LockObject{
	
	int order = 0;

}
