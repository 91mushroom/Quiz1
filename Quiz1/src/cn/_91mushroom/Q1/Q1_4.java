package cn._91mushroom.Q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

/**
 * 1） 随机生成100个随机的浮点数，放到数组里；屏幕上打印出来；
 * 2） 找出这个数组中最大的5个数字；屏幕上打印出来；
 * 3） 把第1题中随机数输出到一个文件random_numbers.txt中，每个数字是一行；
 * 4） 从第3题的文件读入数字放进数组里，并对数组进行排序，把排序后的数组输出到文件sorted_numbers.txt，每个数字一行；
 * 5） 创建一个学生类，有姓名，身高；随机生成100个学生信息，放到数组里；对这100个学生数组按照身高排序，然后输出到文件students.txt，每个人一行；
 * @author H.H
 *
 */
public class Q1_4 { 
	
	/**
	 *  随机生成100个随机的浮点数，放到数组里；屏幕上打印出来
	 * @return
	 */
	public static double[] createRandomNumber(int n){
		
		double[] result = new double[n];
		
		for (int i = 0; i < n; i++){
			result[i] = Math.random();
		}
		
		System.out.println("随机生成的" + n + "个数是：");
		
		for (double d : result) {
			System.out.println(d);
		}
		
		return result;
	}
	
	
	/**
	 * 将第1题中随机数输出到一个文件random_numbers.txt中，每个数字是一行；
	 * @param number
	 */
	public static void writeNumber2File(double[] number){
		
		File file = new File("random_numbers.txt");
		if(!file.exists()){
			try {
				
				file.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
		
		Writer writer =null;
		
		try {
			writer = new FileWriter(file);
			for (double d : number) {
				writer.write(d + "\r\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关闭输出流
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}
	
	/**
	 * 从第3题的文件读入数字放进数组里，并对数组进行排序，把排序后的数组输出到文件sorted_numbers.txt，每个数字一行；
	 */
	public static void sortNumber(int n){
		File inputFile = new File("random_numbers.txt");
		File outputFile = new File("sorted_numbers.txt");
		
		double[] result = new double[n];
		
		if(inputFile.exists()){
			Reader reader = null;
			Writer writer = null;
			BufferedReader  br = null;
			try {
				
				reader = new FileReader(inputFile);
				br = new BufferedReader(reader);
				
				String line = null;

				try {
					int index = 0;
					while((line = br.readLine()) != null){
						result[index++] = Double.parseDouble(line);
					}
					
					//将从文件中读入的数据进行排序
					Arrays.sort(result);
					//创建输出文件
					if(!outputFile.exists()){
						try {
							
							outputFile.createNewFile();
								
						} catch (IOException e) {
							e.printStackTrace();
							return;
						}
					}
					
					writer = new FileWriter(outputFile);
					for (double d : result) {
						writer.write(d + "\r\n");
					}
					
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally{
				//关闭输入流
				if (reader != null){
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				//关闭输出流
				if(writer != null){
					try {
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				if(br != null){
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
	/**
	 * 生成随机5个字符的随机名字
	 * @return
	 */
	public static String getRandomName(){
		
        StringBuilder sb = new StringBuilder();;
        for (int i = 0; i < 5; i++) {
             
            char c = (char) ((Math.random() * 26) + 97);
            sb.append(c);
        }
       return sb.toString();
	}
	
	/**
	 * 生成随机150 - 190之间的随机身高值
	 * @return
	 */
	public static Integer getRandomheight(){
		return (int)(Math.random() * 40 + 150);
	}
	
	/*
	 * 随机生成100个学生的信息，并按照身高排序然后将学生信息写入文件中
	 */
	public static void createStedent(){
		
		Student[] students = new Student[100];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(getRandomName(), getRandomheight());
		}
		
		Arrays.sort(students);
		
		File file = new File("students.txt");
		if (!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
		
		Writer writer = null;
		try {
			
			writer = new FileWriter(file);
			for (Student student : students) {
				writer.write(student.toString() + "\r\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (writer != null){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		//生成随机数的个数
		int n = 100;
		
		//随机生成100个随机的浮点数，放到数组里；屏幕上打印出来；
		double[] temp = createRandomNumber(n);
		
		//找出这个数组中最大的5个数字；屏幕上打印出来；
		int topk = 5;
		double[] Top5 = Topk.getTopK(temp, topk);
		
		System.out.println("最大的五个数分别是：");
		for (int i = 1; i <= topk; i++) {
			System.out.println(Top5[i]);
		}
		
		// 把第1题中随机数输出到一个文件random_numbers.txt中，每个数字是一行；
		writeNumber2File(temp);
		
		// 从第3题的文件读入数字放进数组里，并对数组进行排序，把排序后的数组输出到文件sorted_numbers.txt，每个数字一行；
		sortNumber(n);
		 
		//创建一个学生类，有姓名，身高；随机生成100个学生信息，放到数组里；对这100个学生数组按照身高排序，然后输出到文件students.txt，每个人一行
		createStedent();
	}
}

/**
 * 
 * @author H.H
 *
 */
class Topk{
	
	/**
	 * 创建堆
	 * @param origin
	 * @param k
	 * @return
	 */
	static double[] createHeap(double[] origin, int k){
		
		double[] result = new double[k + 1];

		for ( int i = 1; i <= k; i++){
			result[i] = origin[i];
		}
		
		shiftDown(result, 0);
				
		return result;
	}
	
	/**
	 * 向下调整保持最小堆
	 * @param origin
	 * @param start
	 */
	static void shiftDown(double[] origin, int start){
		
		int index = start;
		if (start != 0){
			index = (origin.length - 1)/2;
		}
		
		for (int i = index; i > 0; i--){
			int t = i;
			while(t * 2 <= origin.length - 1){
				int minIndex = t;
				minIndex = origin[minIndex] > origin[t*2] ? t*2 : minIndex;
				minIndex = origin[minIndex] > origin[t*2+1] ? t*2+1 : minIndex;
				
				if (minIndex != t){
					double temp = origin[t];
					origin[t] = origin[minIndex];
					origin[minIndex] = temp;
				}else{
					break;
				}
				
				t = minIndex;
			}
		}
		
	}
	
	
	static double[] getTopK(double[] origin, int k){
		
		double[] result = createHeap(origin, k);
		for (int i = k+1; i < origin.length; i++){
			if(origin[i] > result[1]){
				 result[1] = origin[i];
				 shiftDown(result, 1);
			}
		}
		return result;
		
	}
}

