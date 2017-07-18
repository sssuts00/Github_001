package Round_12;

class Outer{
	private int x = 100;
	private static int y = 200;
	public Outer() {	}
	public void disp(){
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	class Inner{
		private int a = 10;
		//private static int b = 200; // 자기 자신의 맴버 속에 static을 선언 할 수 없다.
		public Inner() {	}
		public void disp_in(){
			System.out.println("a = " + a);
			System.out.println("x = " + x); //바깥쪽 private 선언이 되어있어도 사용 할 수 있다..
			System.out.println("y = " + y);
		}
		
		class Outer_Inner{	}
		
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		oi.disp_in();
		
		Outer.Inner.Outer_Inner oio = oi.new Outer_Inner();
		
	}
}
