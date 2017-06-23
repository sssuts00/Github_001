package Round_08;

import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int[][] num = null;
		
		System.out.print("몇행 = ");
		int x = sc.nextInt();
		num = new int[x][];
		
		for(int i=0; i<num.length; ++i){
			System.out.print(i + "번째 행의 열 = ");
			int y = sc.nextInt();
			num[i] = new int[y];
		}
		
		for(int i=0; i<num.length; ++i){
			for(int j=0; j<num[i].length; ++j){
				System.out.print("num["+ i +"]["+ j +"]= ");
				num[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		for(int i=0; i<num.length; ++i){
			for(int j=0; j<num[i].length; ++j){
				System.out.println("num["+ i +"]["+ j +"] : " + num[i][j]);
			}
		}

	}

}
