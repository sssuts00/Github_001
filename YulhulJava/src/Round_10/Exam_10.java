package Round_10;

import java.io.IOException;
import java.util.Scanner;

public class Exam_10 {
	
	//Round_08의 11번째 복사해서 붙여넣은 다음 Exam_10 으로 수정 하지 않았음... 구찮아서
	
	
	public static void main(String[] args) throws IOException {
		// 성적처리 및 석차 처리 예제
		if(args.length != 1){
			System.out.println("Usage : java Exam_11 인원수");
			System.exit(0);
		}
		int inwon = Integer.parseInt(args[0]);
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] math = new int[inwon];
		int[] tot = new int[inwon];
		float[] avg = new float[inwon];
		int[] rank = new int[inwon];
		
		for(int i = 0; i<inwon; ++i){
			System.out.println(i + "번째 사람 이름 : ");
			name[i] = sc.next();
			System.out.println(i + "번째 사람 국어 : ");
			kor[i] = sc.nextInt();
			System.out.println(i + "번째 사람 영어: ");
			eng[i] = sc.nextInt();
			System.out.println(i + "번째 사람 수학 : ");
			math[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.0f;
			
			rank[i] = 1; //  tot의 공간 값이 크냐 작으냐 에따라 rank가 매겨지므로 1을 넣어준다.
		}
		
		for(int i=0; i<inwon; ++i ){
			for(int j=0; j<inwon; ++j){
				if(tot[i] <tot[j]){
					rank[i]++;
				}
			}
		}
		
		System.out.println();
		for(int i=0; i<inwon; ++i){
			System.out.print(name[i] + "\t");
			System.out.print(kor[i] + "\t");
			System.out.print(eng[i] + "\t");
			System.out.print(math[i] + "\t");
			System.out.print(tot[i] + "\t");
			System.out.printf("%.2f\t", avg[i]); // %.2f 소수점 2쨰자리 까지 표현
		}
		/*
		 * cmd창에서 컴파일 후 cmd창에서 실행해야됨
		 */

	}

}
