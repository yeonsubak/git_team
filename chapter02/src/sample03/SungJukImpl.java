package sample03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private Scanner scan;
	
	public SungJukImpl(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public void calcTot() {
		this.tot = kor + eng + math;
	}

	@Override
	public void calcAvg() {
		this.avg = tot / 3.0;
	}

	@Override
	public void display() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name + "\t"
						 + kor + "\t"
						 + eng + "\t"
						 + math + "\t"
						 + tot + "\t"
						 + df.format(avg));
	}

	@Override
	public void modify() {
		scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		name = scan.next();
		System.out.print("국어 입력: ");
		kor = scan.nextInt();
		System.out.print("영어 입력: ");
		eng = scan.nextInt();
		System.out.print("수학 입력: ");
		math = scan.nextInt();
		calcTot();
		calcAvg();
		System.out.println();
		display();
	}

}
