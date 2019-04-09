package cn._91mushroom.Q2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入类
 * @author Administrator
 *
 */
public class Inputer {
	
	private String info;
	private List<IObserver> observers = new ArrayList<>();
	
	
	public void add(IObserver observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers(String info){
		
		for (IObserver observer : observers) {
			observer.update(info);
		}
		
	}
	
	public void getInputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入：");
		info = sc.nextLine();
		
		notifyAllObservers(info);
		
	}
	
}
