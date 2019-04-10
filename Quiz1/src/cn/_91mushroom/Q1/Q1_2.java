package cn._91mushroom.Q1;

/***
 * Q1.2 随机生成一个int类型的5位数，把它的二进制形式每一位打印到屏幕上；
 * @author H.H
 *
 */
public class Q1_2 {
	
	private  static final int CONSTANT_BIT = 32;
	
	/**
	 * 返回一个5位的整数
	 * @return
	 */
	public static int createNumber(){
		
		//产生5位的整数
		return (int)(Math.random()*90000) + 10000;

	}
	
	/**
	 * 将输入的数字转换成二进制
	 * @param number 需要转换的数字
	 * @return 
	 */
	public static String dec2Bin(int number){
		
		int system = 2;
		StringBuilder result =  new StringBuilder();
		
		while(number != 0){
			result.append(number % system);
			number = number / system;
		}
		
		return result.reverse().toString();
	}
	
	/**
	 * 通过位运算将数字的二进制形式的每一位打印出来
	 * @param number
	 */
	public static String PrintNumberByBit(int number) {
		
		StringBuilder result =  new StringBuilder();
		
		for(int i = 0; i < CONSTANT_BIT; i++) {
			int temp = (number & 0x80000000 >>> i) >>> (CONSTANT_BIT - i - 1);
			result.append(temp);
		}
		
		return result.toString();
	}
	

	
	public static void main(String[] args) {
		int randomNumber = createNumber();
		String result = dec2Bin(randomNumber);
		System.out.println(randomNumber + "转换为二进制的结果为:" + result);
		System.out.println(randomNumber + "通过位运算转换为二进制结果为："  + PrintNumberByBit(randomNumber));
	}
	
}

