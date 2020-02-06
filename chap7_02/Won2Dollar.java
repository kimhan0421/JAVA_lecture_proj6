package chap7_02;

public class Won2Dollar extends Converter{

	public Won2Dollar(double ratio) {
		super(ratio);
	}

	@Override
	protected double convert(double src) {
		double doll = src * 1200;
		return doll;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
