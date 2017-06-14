package Round_08;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		int [] x = new int [3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; ++i){
			System.out.print(i + " = ");
			x[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int i = 0; i< x.length; ++i){
			System.out.println(i + " = " + x[i]);
		}

	}

}
