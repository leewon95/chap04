package test;

public class Grade {
	private int math;
	private int science;
	private int english;
	int average = (math+science+english)/3;
	
	public void Grade(int math, int science, int english) {
		
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void average() {
		int average;
	}
}
