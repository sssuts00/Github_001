package Round_12;

class Outer2 {
	private int x = 100;
	private static int y = 200;
	public void disp() {
		class inner2 {
			private int a = 10;
			//private static int b = 20; 일반 클래스 속에 static을 넣을수 없다.
			
			public void disp_in() {
				System.out.println("a = " + a);
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
		}
		
		inner2 in  = new inner2();
		in.disp_in();
	}
	
	
}


public class Exam_04 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		ot.disp();
	}
}
