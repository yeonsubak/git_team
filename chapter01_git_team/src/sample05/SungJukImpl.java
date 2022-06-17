package sample05;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	
	
	
	public SungJukImpl() {
		Scanner scn = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = scn.next();
		System.out.print("국어 입력 : ");
		kor = scn.nextInt();
		System.out.print("영어 입력 : ");
		eng = scn.nextInt();
		System.out.print("수학 입력 : ");
		math = scn.nextInt();
	}
	
	@Override
	public void calc() {
		sum = kor + eng + math;
		avg = sum / 3.0;
	}

	@Override
	public void display() {
		
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name +"\t"
							+ kor + "\t" 
							+ eng + "\t" 
							+ math + "\t" 
							+ sum + "\t"
							+ String.format("%.3f", avg));
	}

}
