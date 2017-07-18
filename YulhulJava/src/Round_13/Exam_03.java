package Round_13;

class AAA{
	private int x;
	public AAA() {
		//super(); 생략이 되어있다.
	}
	public void disp(){
		System.out.println("x = " + this.x);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA ap = new AAA();
		System.out.println("ap = " + ap); // ap.toString()
	}
}
