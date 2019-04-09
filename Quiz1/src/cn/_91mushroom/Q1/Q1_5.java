package cn._91mushroom.Q1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *给定字符串“Java is a general-purpose computer-programming language” 计算这句话中所有出现的字母及出现的次数；
 * @author H.H
 *
 */
public class Q1_5 {
	
	/**
	 * 通过hashmap统计字母出现的次数
	 * @param origin
	 * @return
	 */
	public static Map<Character, Integer> getCharCount(String origin){
		Map<Character, Integer> result = new HashMap<>();
		
		for (int i = 0; i < origin.length(); i++){
			char temp = origin.charAt(i);
			if( Character.isLowerCase(temp) || Character.isUpperCase(temp)){
				if (result.containsKey(temp)){
					result.put(temp, result.get(temp) + 1);
				}else{
					result.put(temp,1);
				}
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String origin  = "Java is a general-purpose computer-programming language";
		Map<Character, Integer> result = getCharCount(origin);
		
	    Set<Character> keySet = result.keySet();
	    for (Character c : keySet) {
			System.out.println("字母：" + c + " 出现了：" + result.get(c) + "次");
		}
		
		
	}
}
