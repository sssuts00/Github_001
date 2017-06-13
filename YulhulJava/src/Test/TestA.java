package Test;

import java.util.Arrays;
import java.util.Scanner;

public class TestA {
	/*
	 * Title: Find the eldest brother! Problem: There are 5 brothers in a
	 * family, you need to tell eldest brother's age. You are given age of all
	 * the brothers. Input: Input contains 5 numbers separated by space
	 * indicating the ages of 5 brothers. Output: Print the age of eldest
	 * brother. Constraints: 1≤age≤100 
	 * Sample Input: 6 3 24 12 22 
	 * Sample Output: 24
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
         
         int agee [] = new int[5];
         
         System.out.print("0보다 크고 100작은 5개 정수를 입력하세요. :");
         
         for(int i =0; i<5; i++){
            
            int age = sc.nextInt();
            
            if(1<= age && age<=100){
               agee[i] = age;
               
            }else if(agee[i] == 0){
               
               System.out.println(agee[i]+"번쨰가 범위를 벗어났습니다..");
               System.out.println("다시입력하라");
               i = 0;
            }
         }
            
         System.out.println(Arrays.toString(agee));
         Arrays.sort(agee); //배열값 sort오름차순정렬  reverse내림차순정렬
          System.out.println("최대값 : " + agee[agee.length - 1]); //최대값 도출
	}

}
