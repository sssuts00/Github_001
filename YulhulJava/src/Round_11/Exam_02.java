package Round_11;

class Exam_02_Sub{
	private String name;
	private double don;
	private static float iyul; //같은클래스 발생된 객체에 한해서 같은 하나의 공간을 가지게 한다.
	//프로그램 시작시 할당되고 프로그램 종료시 메모리가 소멸
	
	static{// static 초기화 영역의해  초기화 되어야 한다.
		iyul = 0.05f;
	}
	
	public static void setIyul(float iyul){
		Exam_02_Sub.iyul = iyul; //클래스명을 적여야한다.
		//this.iyul = iyul;  //static에서 this를 쓸수없다.
	}
	
	public Exam_02_Sub(String name, double don, float iyul) {
		this.name = name;
		this.don = don;
		Exam_02_Sub.iyul = iyul;
	}
	
	public void disp(){
		System.out.println("name : " + this.name);
		System.out.println("don : " + this.don);
		System.out.println("iyul: " + Exam_02_Sub.iyul);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Exam_02_Sub es = new Exam_02_Sub("a", 1000.0, 0.07f);
		es.disp();
		System.out.println();
		Exam_02_Sub es1 = new Exam_02_Sub("b", 1000.0, 0.03f);
		es.disp();
		es1.disp();
		Exam_02_Sub es2 = new Exam_02_Sub("c", 1000.0, 0.05f);
		es.disp();
		es1.disp();
		es2.disp();
	}
}
