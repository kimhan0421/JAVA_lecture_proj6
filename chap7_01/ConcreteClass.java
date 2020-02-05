package chap7_01;

public class ConcreteClass extends AbstractClass{
	private int j;
	
	public ConcreteClass(int i, int j) {
		super(i);		
		this.j = j;
	}
	
	public void show() {
		System.out.println("i=" + i + ","+ "j=" + j);
	}

	public static void main(String[] args) {
		AbstractClass obj = new ConcreteClass(100,50);
		obj.show();

	}

}
