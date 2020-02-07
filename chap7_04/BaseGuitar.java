package chap7_04;

public class BaseGuitar extends Guitar implements IBehavior {
	@Override
	public void play() {
		System.out.println("베이스 기타를 연주하다.");
	}

}
