package ch06.ch01;

public class Student {
	int sno;
	String name;
	int kor;
	int math;
	int eng;

	public Student(int sno, String name, int kor, int math, int eng) {
		this.sno = sno;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public int getSno() {return sno;}

	public String getName() {return name;}

	public int getKor() {return kor;}

	public int getMath() {return math;}

	public int getEng() {return eng;}
}