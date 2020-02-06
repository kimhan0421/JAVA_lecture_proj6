package chap7_02;

import java.util.Scanner;

public abstract class Converter {
	protected double ratio;
	public Converter(double ratio) {
		this.ratio = ratio;
	}
	
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + " 을 " +getDestString() +"로 바꿉니다.");
		System.out.println(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.printf("변환결과 : %.2f %s입니다.\n",res,getDestString());
		scanner.close();
	}

}
