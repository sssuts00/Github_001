package Round_08;

import java.io.IOException;
import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int [] x = null;
		
		System.out.print("num = ");
		num = sc.nextInt();
		x = new int [num]; //입력받은 값을 배열에 할당해서 동적으로 배열할당이 가능하다
		
		for(int i = 0; i < x.length; ++i){
			System.out.println("x[" + i +"] = " + x[i]);
		}

	}

}
