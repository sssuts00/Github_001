package Round_12;

class Outer1{
	private int x = 100;
	private static int y = 200;
	public Outer1() { }
	public void disp(){
		System.out.println("x = " + x);
		System.out.println("y = " + y);	
	}
	
	static class inner1{
		private int a = 10;
		private static int b = 20;
		public inner1() { }
		public void disp_in(){
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			//System.out.println("x = " + x); �Ϲ� �ɹ��� ������ �Ҽ�����.
			System.out.println("y = " + y);	 // y���� static���� ������ �� �ִ�.
		}
	}
	
}


public class Exam_02 {
	public static void main(String[] args) {
		Outer1.inner1 oi = new Outer1.inner1();
		oi.disp_in();

	}
	
}
