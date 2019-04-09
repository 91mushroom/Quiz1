package cn._91mushroom.Q2_3;

import java.util.Scanner;

public class printInfo {
	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
		
		while(true) {
			System.out.print("请输入：");
			String info = scanner.nextLine();
			System.out.println(info);
		}
	}
}
