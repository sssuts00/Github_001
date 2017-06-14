package Round_07;

public class Exam_01 {
	
	public static void view_star(){ // 접근제어자 static 돌려줄값이없다. view_star()
		System.out.println("*****");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*****");
		System.out.println("홍길동");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("임꺽정");
		System.out.println("박문수");
		System.out.println("*****");
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		// 자주 반복적으로 사용이 가능한것을 메소드화 해서 사용이 가능하다.
		
		view_star();
		System.out.println("홍길동");
		view_star();
		view_star();
		System.out.println("임꺽정");
		System.out.println("박문수");
		view_star();
		
		
	}

}
