package chap7_04;

public class IBehaviorTest {

	public static void main(String[] args) {
		IBehavior behavior[] = new IBehavior[2];
		behavior[0] = new Soccer();
		behavior[1] = new BaseGuitar();
		for(IBehavior ib :behavior) {
			ib.play();
		}

	}

}
