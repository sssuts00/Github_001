package Round_13;

class A { // �ڹٿ��� ������ Ŭ������ ����� �Ǹ� extands Object��  �����Ǿ ��ӵǾ��ִ�...
	public void aaa(){
		System.out.println("aaaa");
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		A ap = new A();
		ap.aaa(); //aŬ������ aaa()�޼��带 ȣ��
		
		System.out.println("Ŭ���� = " + ap.getClass()); //getClass() -> Ŭ������ �̸��� ���� ��Ų��.
		System.out.println("toString = " + ap.toString());
		System.out.println("ap = " + ap);
		
	}
}
