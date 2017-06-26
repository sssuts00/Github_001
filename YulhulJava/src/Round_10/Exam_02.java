package Round_10;

public class Exam_02 {

	private int x = 100;
	private char y = 'A';
	
	public static void main(String[] args) {
		Exam_02 ex = new Exam_02();
		System.out.println("x = " + ex.x); //호출하는 위치가 틀리고 같은 클래스 내에 있으므로 가능하다
		System.out.println("y = " + ex.y);

	}

}
