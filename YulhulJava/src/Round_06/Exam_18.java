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
		avg = tot / 3.0f; // 3���� ������ �Ǹ� ���� ������ ������ ����(��)�� ������ ������.. ������ �Ǽ��� ����� �Ǽ����� ���´�.
		
		System.out.println();
		System.out.println("tot = " + tot + "��");
		System.out.printf("avg = %.2f��" , avg); // %.2f = > �Ҽ��� 2�������� ��Ÿ���ڴٴ� �ǹ�

	}

}
