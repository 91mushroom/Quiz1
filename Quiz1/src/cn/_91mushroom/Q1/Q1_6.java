package cn._91mushroom.Q1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网上随便复制一段英文，要求算出每个单词出现的次数
 * @author H.H
 *
 */
public class Q1_6 {
	
	/**
	 * 统计传入的字符中每个单词出现的个数
	 * @param origin
	 * @return
	 */
	public static Map<String,Integer> getWordCount(String origin){
		
		Map<String, Integer> result = new HashMap<>();
	    Pattern p = Pattern.compile("\\b[a-zA-Z]+\\b");
        Matcher m = p.matcher(origin);
        while(m.find()){
        	String temp = m.group();
        	if(result.containsKey(temp)){
        		result.put(temp, result.get(temp) + 1);
        	}else{
        		result.put(temp, 1);
        	}
        }
	  
	   return result;
	}
	
	
	public static void main(String[] args) {
		String origin  = "We all stood there under the awning and just inside the door of the Wal-Mart. We all waited, some patiently, others irritated, because nature messed up their hurried day. I am always mesmerized by rainfall. I get lost in the sound and sight of the heavens washing away the dirt and dust of the world. Memories of running, splashing so carefree as a child come pouring in as a welcome reprieve from the worries of my day.";
		String lowerOrigin = origin.toLowerCase().replace("-", "");
		Map<String, Integer> result = getWordCount(lowerOrigin);
		
		for (String string : result.keySet()) {
			System.out.println("单词：" + string + " 出现了：" + result.get(string) + "次");
		}
		
	}
}
