package Test;

import java.util.Scanner;

/*
 * 국어, 영어, 수학, 점수를 입력받아  총점과 평균을 구하는 성적처리 프로그램
 */

public class Round_09_moonje {

	public static void main(String[] args) {
		
		int[] sub = new int[4]; //0:kor, 1:eng, 2:math, 3:tot
		float avg;
			
		Scanner sc = new Scanner(System.in);
	
		String[] str = {"국어", "영어", "수학"};
		
		for(int i=0; i<str.length; ++i){
			System.out.print(str[i] + " = ");
			sub[i] = sc.nextInt();
			sub[sub.length] =+ sub[i];
		}
		System.out.println("tot = " + sub[sub.length]);
		System.out.println(sub[1]);
		System.out.println(sub[2]);
		System.out.println(sub[3]);
		
	}

}
