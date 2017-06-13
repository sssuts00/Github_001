package Round_06;

import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int su1 = 0, su2 = 0, tot = 0;
		char yon = 0;
		
		System.out.print("su1 = ");
		su1 = sc.nextInt();
		
		do{	
			System.out.print("yon (+,-,*,/) = ");
			yon = sc.next().charAt(0); //String형을 char형으로 변형하기위해 charAt(0)으로
		}while( yon !='+' && yon !='-' && yon !='*' && yon !='/' ); // +,-,*,/ 가 아닐경우....
		
		do{
			System.out.print("su2 = ");
			su2 = sc.nextInt();
		}while(yon == '/' && su2 == 0); // '/'일때 su2에 0을 입력하면 ...
		
		
		switch (yon) {
		case '+':
			tot = su1 + su2;
			break;
		case '-':
			tot = su1 - su2;
			break;
		case '*':
			tot = su1 * su2;
			break;
		case '/':
			tot = su1 / su2;
			break;

/*		default:
			break;*/
		}
		
		System.out.println();
		System.out.println(su1 + "" + yon + "" + su2 + " = " + tot); 
		 

	}

}
