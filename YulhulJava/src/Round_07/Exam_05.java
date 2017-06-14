package Round_07;

import java.util.Scanner;

public class Exam_05 {

	public static String getstring(String str){
		Scanner sc = new Scanner(System.in);
		System.out.print(str + " = ");
		String s = sc.nextLine();
		
		return s;
	}
	
	public static int getint(String str){
		Scanner sc = new Scanner(System.in);
		System.out.print(str + " = ");
		int s = sc.nextInt();
		
		return s;
	}
	
	public static void main(String[] args) {
		String name = getstring("이름");
		int age = getint("나이");
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);

		
		
	}

}
