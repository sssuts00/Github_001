package Round_13;

class A { // 자바에서 임의의 클래스를 만들게 되면 extands Object를  생략되어서 상속되어있다...
	public void aaa(){
		System.out.println("aaaa");
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		A ap = new A();
		ap.aaa(); //a클래스의 aaa()메서드를 호출
		
		System.out.println("클래스 = " + ap.getClass()); //getClass() -> 클래스의 이름을 리턴 시킨다.
		System.out.println("toString = " + ap.toString());
		System.out.println("ap = " + ap);
		
	}
}
