package chap7_04;

public class Soccer extends Sport implements IBehavior {
	@Override
	public void play() {
		System.out.println("축구를 하다");
	}

}
