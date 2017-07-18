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
		System.out.println("x = " + this.x); //this는 클래스 내의 자기자신을...
		System.out.println("y = " + super.y); //super는 상위클래스내의 자기자신을..
		System.out.println("z = " + z); // 하위와 상위 클래스의 겹치는 변수 부분이 없으므로 this를해도 F클래스의 z를 super를 해도  F클래스의 z를 나타낸다.
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		
	}
}
