package cn._91mushroom.Q1;

/**
 * 写一个归算法，把字符串反转，比如字符串"hello"反转后是"olleh"
 * @author H.H
 *
 */
public class Q1_7 {
	
	public static String reverseWord(String origin){
		if (origin.length() <= 1){
			return origin;
		}
		
		return reverseWord(origin.substring(1)) + origin.charAt(0);
	}
	  
	public static void main(String[] args) {
		String origin = "hello";
		String result = reverseWord(origin);
		System.out.println("字符串：" + origin + " 反转后的结果是：" + result);
	}
}
