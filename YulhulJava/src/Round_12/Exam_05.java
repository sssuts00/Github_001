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
		inner3 in = new inner3(){ //bbb() 재정의
			public void bbb(){
				System.out.println("ddd");
				ddd();
			}
			
			public void ddd(){ //재정의 해서 사용은 가능하지만 새롭게 메서드를 만들수없다.
				System.out.println("ddd");
			}
		};
		
		in.aaa();
		in.bbb();
		in.ccc();
		//in.ddd(); ddd()를 불러 올수 없고 재정의된 bbb()의 안에 ddd()를 불러올수 있다.
	}
}
