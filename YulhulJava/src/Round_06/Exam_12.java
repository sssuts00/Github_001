package Round_06;

public class Exam_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot = 0;
		
		for(int i = 1; i<=100; ++i){
			if(i % 3 == 0){
				tot +=i;
			}
		}
		System.out.println("tot = " + tot);
	}

}
