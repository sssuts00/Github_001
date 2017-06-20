package Round_08;

import java.io.IOException;
import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) throws IOException {
		//데이터 공간 할당 및 값 입력과 출력 예제
		
		Scanner sc = new Scanner(System.in);
		int inwon = 0;
		String[] name = null;
		int[] age = null;
		
		System.out.print("인원 =");
		inwon = sc.nextInt();
		name = new String[inwon];
		age = new int[inwon];
		
		for(int i=0; i<inwon; ++i){
			System.out.print(i + 1 +"번째사람이름 = "); //0번쨰 부터 시작하기떄문에 1더함
			name[i] = sc.next();
			System.out.print(i + 1 +"번째사람나이 = ");
			age[i] = sc.nextInt();
			
		} 
		
	/*	for(int i=0; i<inwon; ++i){
			
		}*/
		
		System.out.println();
		for(int i=0; i<inwon; ++i){
			System.out.println(i + 1 + ":" + name[i] + ":" + age[i]);
		}
	} 

}
