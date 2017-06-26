package Round_10;

import java.util.Scanner;

class Exam_11_Sub{ // 변수 선언
	private Scanner sc;
	//디폴트로 생성자 초기화 하고싶으면 private Scanner sc = new Scanner(System.in); 선언해 주어도 된다.
	private String name;
	private int kor, eng, math;
	private int tot;
	private float avg;
	
	public Exam_11_Sub() { //생성자를 초기화
		sc = new Scanner(System.in);	
	}
	
	public void input(){
		System.out.println("국어 = ");
		kor = sc.nextInt();
		System.out.println("영어 = ");
		eng = sc.nextInt();
		System.out.println("수학 = ");
		math = sc.nextInt();	
	}
	
	public void calc(){
		tot = kor + eng + math;
		avg = tot / 3.0f;
	}
	
	public void output(){
		System.out.println("name : " + name);
		System.out.println("tot : " + tot);
		System.out.println("avg : " + avg);
	}
	
}

public class Exam_11 {

	public static void main(String[] args) {
		
		Exam_11_Sub ex = new Exam_11_Sub();
		ex.input();
		ex.calc();
		ex.output();

	}

}
