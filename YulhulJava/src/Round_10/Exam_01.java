package Round_10;

class Exam_01_Sub{
	private int x = 100;
	private char y = 'A';
	public void viewX(){
		System.out.println("x = " + x);
	}
}

public class Exam_01 {

	
	
	public static void main(String[] args) {
		Exam_01_Sub ex = new Exam_01_Sub();
		//System.out.println("x = " + ex.x); // private�� int x �� ����Ǿ� �־ ������ �� ����.
		ex.viewX();
		//System.out.println("x = " + ex.y);

	}

}
