package Round_12;

class inner3{
	public void aaa(){
		System.out.println("aaa");
	}
	public void bbb(){
		System.out.println("bbb");
	}
	public void ccc(){
		System.out.println("ccc");
	}
	
}

public class Exam_05 {
	public static void main(String[] args) {
		inner3 in = new inner3(){ //bbb() ������
			public void bbb(){
				System.out.println("ddd");
				ddd();
			}
			
			public void ddd(){ //������ �ؼ� ����� ���������� ���Ӱ� �޼��带 ���������.
				System.out.println("ddd");
			}
		};
		
		in.aaa();
		in.bbb();
		in.ccc();
		//in.ddd(); ddd()�� �ҷ� �ü� ���� �����ǵ� bbb()�� �ȿ� ddd()�� �ҷ��ü� �ִ�.
	}
}
