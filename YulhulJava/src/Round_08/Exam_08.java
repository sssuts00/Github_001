package Round_08;

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inwon = 0;
		String[] name = null;
		int[] age = null;
		
		System.out.println("인원 =");
		inwon = sc.nextInt();
		name = new String[inwon];
		age = new int[inwon];
		
		for(int i=0; i<inwon; ++i){
			System.out.println(i + 1 +"번째사람이름 = ");
		} 
 
	} 

}
