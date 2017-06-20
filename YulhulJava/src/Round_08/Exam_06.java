package Round_08;

import java.io.IOException;
import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) throws IOException {
		if(args.length != 1){
			System.out.println("데이터가 없네요");
			System.out.println("Usage: java Exam_07 인원수");
			System.exit(0); //정상종료지시 정상종료값0
		}
		
		int inwon = Integer.parseInt(args[0]);
		
		// 실행방법
		// run configuration -> arguments -> program arguments -> 값입력
		
		Scanner sc = new Scanner(System.in);
		String [] name = new String[inwon];
		
		for(int i = 0; i<name.length; ++i){
			System.out.print(i+"번쨰 사람 이름 = ");
			name[i] = sc.next();
		}
		
		System.out.println();
		for(int i= 0; i<name.length; ++i){
			System.out.println(i+"번쨰 사람 이름 : " + name[i]);
		}
		
	}

}
