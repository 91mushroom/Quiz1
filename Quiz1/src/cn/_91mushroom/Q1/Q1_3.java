package cn._91mushroom.Q1;

/**
 * 随机生成一个9位数，屏幕上打印出来，并把该数字里每一位数分别作为一行打印出来
 * @author H.H
 *
 */
public class Q1_3 {

	/**
	 * 返回一个9位的整数
	 * @return
	 */
	public static int createNumber(){
		
		//产生9的整�?
		return (int)(Math.random()*900000000) + 100000000;

	}
	
	/**
	 * 打印传入数字的每一位
	 * @param number
	 */
	public static void printNumber(int number){
		String temp  = String.valueOf(number);
		for (int i = 0; i < temp.length(); i++){
			System.out.println(temp.charAt(i));
		}
	}
	
	public static void main(String[]  args){
		 
		int number  = createNumber();
		System.out.println("产生的9位数是：" + number);
		printNumber(number);
		
	}
	
	
	/*
	     将传入的数字翻转
	  @param number
	  @return
	 
	public static int reverseNumber(int number){
		 int result = 0;
		 while(number != 0){
			 result = result*10 + number%10;
			 number /= 10;
		 }
		
		 return result;
	}
	
	
	     将传入数字的每一位分别作为一行输出
	  @param number
	 
	public static void printNumber(int number){
		while (number != 0){
			System.out.println(number%10);
			number /= 10;
		}
	}
	*/
}
