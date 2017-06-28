package Round_11;

class Exam_01_Sub{
	private int w;
	private int x;
	private int y;
	private int z;
	
	public Exam_01_Sub() {
		this.w = 0;
		this.x = 100;
		this.y = 200;
		this.z = 300;
	}
	
	public Exam_01_Sub(int x){
		this();//매개변수가 없는 생성자 자기 자신을 가리킨다(값이 모두 대입된다.)호출
		this.x = x; // 거기서 x값만을 바꾼다.
		/* 일일이 다적을 필요없이 this()를 .... 생성자 자신의 매개변수없는 생성자를 호출해서 불러온다.  */
	}
	
	public Exam_01_Sub(int x, int y){
		this(x); // 매개변수x가 있는 생성자 를 호출한다.
		this.y = y;
		
	}
	
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
		this.disp();
	}
	
	public void disp(){
		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
	}
	
	
	
	
}

public class Exam_01 {

	public static void main(String[] args) {
//		Exam_01_Sub ex = new Exam_01_Sub();
//		ex.disp();
//		ex.setXY(10, 20);
//		ex.disp();

		Exam_01_Sub ex1 = new Exam_01_Sub();
		Exam_01_Sub ex2 = new Exam_01_Sub(10);
		Exam_01_Sub ex3 = new Exam_01_Sub(10,20);
				
	}

}
