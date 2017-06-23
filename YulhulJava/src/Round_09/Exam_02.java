package Round_09;

class aa{
	String name;
	int a = 100;
	int b = 200;
	int c = 300;
	
	void aaa(){
		System.out.println(a + " : " + b +" : " + c);
	}
}
class bb{
	int a = 500;
	int b = 2000;
}

public class Exam_02 {

	public static void main(String[] args) {
		aa ap = new aa();
		bb bp = new bb();
		System.out.println("ap.a = " + ap.a);
		System.out.println("ap.b = " + ap.b);
		System.out.println("bp.a = " + bp.a);
		System.out.println("ap.c = " + ap.c);
		
		ap.aaa();
	}

}
