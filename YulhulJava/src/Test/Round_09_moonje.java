package Test;

import java.util.Scanner;

/*
 * ����, ����, ����, ������ �Է¹޾�  ������ ����� ���ϴ� ����ó�� ���α׷�
 */

public class Round_09_moonje {

	public static void main(String[] args) {
		
		int[] sub = new int[4]; //0:kor, 1:eng, 2:math, 3:tot
		float avg;
			
		Scanner sc = new Scanner(System.in);
	
		String[] str = {"����", "����", "����"};
		
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
