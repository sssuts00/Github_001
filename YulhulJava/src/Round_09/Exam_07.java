package Round_09;

public class Exam_07 {

	public static void main(String[] args) {
		
		Exam_05 ex = new Exam_05();
		// 런타임스택영역에 ex가 생성이되고 가비지컬렉션에 5개의 공간이 할당된다. 
		System.out.println("ex.a = " + ex.a);
		
		Exam_05 ex1 = ex;
		ex = null;
		

	}

}
