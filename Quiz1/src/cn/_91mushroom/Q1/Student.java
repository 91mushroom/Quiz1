package cn._91mushroom.Q1;

/**
 * 学生类
 * @author H.H
 *
 */
public class Student implements Comparable<Student> {
	
	private String name;
	private Integer height;
	
	
	public Student() {
		
	}
	
	public Student(String name, Integer height) {
		super();
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.height > o.height){
			return 1;
		}else if(this.height < o.height){
			return -1;
		}
		return 0;
	}
	
	
}
