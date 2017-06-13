package Round_06;

public class Exam_15 {

	public static void main(String[] args) {
		
		aaa:for(int j =0; j<5; ++j){
			bbb:for(int i =0; i<5; ++i){
				if(i == 2)
					break aaa;
				System.out.print("*");				
			}
			System.out.println();
		}
		
	
	
	
		aaa:for(int j =0; j<5; ++j){
			bbb:for(int i =0; i<5; ++i){
				if(i == 2)
					continue aaa;
				System.out.print("*");				
			}
			System.out.println();
		}
		

	}

}
