package Round_08;

import java.io.IOException;
import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) throws IOException {
		// 특정 개수의 알파벳 입력 및 개수 출력 예제
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		char[] ch = null;
		int[] alpha = new int[26]; //0:a개수 1:b개수... 25:z개수
		
		System.out.print("몇개의 문자를 입력 받으시겠습니까? : ");
		num = sc.nextInt();
		ch = new char[num];
		
		System.out.print("문자(대문자) = ");
		for(int i=0; i<ch.length; ++i){
			ch[i] = (char)System.in.read();
		}
		
		// A:65 - Z:90까지
		for(int i=0; i<ch.length; ++i){
			alpha[ch[i] - 65]++;
		}
		
		System.out.println();
		for(int i =0; i<alpha.length; ++i){
			System.out.print((char)(i+65) + "의 개수 = " + alpha[i]);
			if(i % 3 == 2){ //3개씩 끊어서 출력
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
		
	}

}
