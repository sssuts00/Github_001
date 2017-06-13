package Round_06;

import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0, tot = 0;
		float avg = 0.0f;
		
		do{
			System.out.print("kor = ");
			kor = sc.nextInt();
		}while(kor < 0 || kor > 100);
		
		do{
			System.out.print("eng = ");
			eng = sc.nextInt();
		}while(eng < 0 || eng > 100);
		
		do{
			System.out.print("math = ");
			math = sc.nextInt();
		}while(math < 0 || math > 100);
		
		tot = kor + eng + math;
		avg = tot / 3.0f; // 3으로 나누게 되면 정수 나누기 정수는 정수(몫)만 나오기 때문에.. 한쪽을 실수로 해줘야 실수값이 나온다.
		
		System.out.println();
		System.out.println("tot = " + tot + "점");
		System.out.printf("avg = %.2f점" , avg); // %.2f = > 소수점 2차리까지 나타내겠다는 의미

	}

}
