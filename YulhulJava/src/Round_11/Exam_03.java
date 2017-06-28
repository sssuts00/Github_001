package Round_11;

class Exam_03_Sub{
	private final double pi = 3.141592;
	public Exam_03_Sub() { };
	public void setPi(double pi){
		//this.pi = pi;
	}
	
	public double getPi(){
		return pi;
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		Exam_03_Sub es = new Exam_03_Sub();
		System.out.println("pi = " + es.getPi());
		es.setPi(3.141592);
		System.out.println("pi = " + es.getPi());
		
		final int x = 100;
		System.out.println("x = " + x);
		//x = 200; //x가 final이므로 값을 지정 할수없다.
		
	}

}
