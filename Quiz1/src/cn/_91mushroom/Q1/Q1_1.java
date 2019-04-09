package cn._91mushroom.Q1;

import java.util.LinkedList;
import java.util.List;

/***
 * Q 1.1 有数组: 10, 25, 11, 23, 10, 10, 9, 9, 2, 3, 11, 31。要求删除重复的数字，并在屏幕上打印出来。
 * @author H.H
 *
 */

public class Q1_1 {
	
	/**
	 * 删除传入数组中的重复数字并返
	 * @param array
	 * @return
	 */
	public static List<Integer> removeDuplication(Integer[] array){
		
		List<Integer> result = new LinkedList<>();
		
		if (array == null || array.length < 2){
			return result;
		}
		
		for (int index = 0; index < array.length; index++){
			if (!result.contains(array[index])){
				result.add(array[index]);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		Integer[] array = new Integer[]{10, 25, 11, 23, 10, 10, 9, 9, 2, 3, 11, 31};
		
		System.out.println("去重后的结果为：" + removeDuplication(array));
		
	}
}
