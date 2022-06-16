package sample03;

import java.text.DecimalFormat;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SungJukDTO{
	private String name;
	private int kor, eng, math, tot;
	private double avg;
}
