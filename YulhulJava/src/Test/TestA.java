package Test;

import java.util.Arrays;
import java.util.Scanner;

public class TestA {
	/*
	 * Title: Find the eldest brother! Problem: There are 5 brothers in a
	 * family, you need to tell eldest brother's age. You are given age of all
	 * the brothers. Input: Input contains 5 numbers separated by space
	 * indicating the ages of 5 brothers. Output: Print the age of eldest
	 * brother. Constraints: 1��age��100 
	 * Sample Input: 6 3 24 12 22 
	 * Sample Output: 24
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
         
         int agee [] = new int[5];
         
         System.out.print("0���� ũ�� 100���� 5�� ������ �Է��ϼ���. :");
         
         for(int i =0; i<5; i++){
            
            int age = sc.nextInt();
            
            if(1<= age && age<=100){
               agee[i] = age;
               
            }else if(agee[i] == 0){
               
               System.out.println(agee[i]+"������ ������ ������ϴ�..");
               System.out.println("�ٽ��Է��϶�");
               i = 0;
            }
         }
            
         System.out.println(Arrays.toString(agee));
         Arrays.sort(agee); //�迭�� sort������������  reverse������������
          System.out.println("�ִ밪 : " + agee[agee.length - 1]); //�ִ밪 ����
	}

}
