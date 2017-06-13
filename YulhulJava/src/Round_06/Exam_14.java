package Round_06;

public class Exam_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i =65; i<=90; ++i){
			System.out.println((char)i);
		}*/
		
		for(char i = 'A'; i<='Z'; ++i){		
		System.out.print(i + " : ");
			for(char c = i; c <='Z'; ++c){
				System.out.print(c);
			}
		System.out.println();
		}
		
		
		/*//역순
		for(char i = 'A'; i<='Z'; ++i){		
			System.out.print(i + " : ");
				for(char c = i; c <='Z' - (i -65); ++c){
					System.out.print(c);
				}
			System.out.println();
			}
		*/
		
		/*//가운데
		for(char i = 'A'; i<='Z'; ++i){		
			System.out.print(i + " : ");
				
				for(int j =0; c<i-65; ++j){
					System.out.println(" ");
				}
			
				for(char c = i; c <='Z'; ++c){
					System.out.print(c);
				}
			
				System.out.println();
			}
		*/
	}

}
