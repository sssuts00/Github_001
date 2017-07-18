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
		//private static int b = 200; // �ڱ� �ڽ��� �ɹ� �ӿ� static�� ���� �� �� ����.
		public Inner() {	}
		public void disp_in(){
			System.out.println("a = " + a);
			System.out.println("x = " + x); //�ٱ��� private ������ �Ǿ��־ ��� �� �� �ִ�..
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
