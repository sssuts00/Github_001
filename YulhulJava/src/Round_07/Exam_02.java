package Round_07;

public class Exam_02 {
	
	public static void view_star(int x){
		
		for(int i = 0; i<x; ++i){
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		view_star(5);
		System.out.println("홍길동");
		view_star(3);
		view_star(10);
		System.out.println("임꺽정");
		System.out.println("김문수");
		view_star(7);

	}

}
