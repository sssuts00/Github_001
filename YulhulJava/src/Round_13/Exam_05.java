package Round_13;

class DD {
	protected int x = 100;
	protected int y = 200;
	public void disp() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}
}
class EE extends DD {
	private int z = 300;
	public void display() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

	}
}

public class Exam_05 {
	public static void main(String[] args) {
		
	}
}
