package Round_07;

import java.util.Scanner;

public class Exam_04 {
	public static int hap(int su1, int su2){
		return su1+su2;
	}
	public static int cha(int su1, int su2){
		int imsi = 0;
		if(su1 > su2){ 
			imsi = su1 - su2;
		}else{// 큰값에서 작은값을 뺴면 정상적인 정수값이 출력되지만 아닐경우
			imsi = su2 - su1;
		}
		return imsi;
	}
	public static int mul(int su1, int su2){
		return su1*su2;
	}
	public static int div(int su1, int su2){
		if(su2 == 0){
			su2 = 1;
		}
		
		return su1/su2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int su1 = 0, su2 = 0;
		char yon = 0;
		int tot = 0;
		
		System.out.print("su1 = ");
		su1= sc.nextInt();
		System.out.print("su2 = ");
		su2 = sc.nextInt();
		
		do{
			System.out.print("yon(+,-,*,/) = ");
			yon = sc.next().charAt(0);
		}while(yon !='+' && yon !='-' && yon !='*' && yon !='/');
		
		switch (yon) {
		case '+':
			tot = hap(su1,su2);
			break;
		case '-':
			tot = cha(su1,su2);
			break;
		case '*':
			tot = mul(su1,su2);
			break;
		case '/':
			tot = div(su1,su2);
			break;

		}
		System.out.println(su1 + " " + yon + " " + su2 + " = " + tot );
		
	}

}
