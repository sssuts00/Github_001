package Round_13;

class F{
	protected int x = 100;
	protected int y = 200;
	protected int z = 500;
}
class H extends F {
	private int x = 300;
	private int y = 400;
	public void disp() {
		System.out.println("x = " + this.x); //this�� Ŭ���� ���� �ڱ��ڽ���...
		System.out.println("y = " + super.y); //super�� ����Ŭ�������� �ڱ��ڽ���..
		System.out.println("z = " + z); // ������ ���� Ŭ������ ��ġ�� ���� �κ��� �����Ƿ� this���ص� FŬ������ z�� super�� �ص�  FŬ������ z�� ��Ÿ����.
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		
	}
}
