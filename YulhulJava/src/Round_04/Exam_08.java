package Round_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam_08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//선언부
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String name = "";
		String age ="";
		
		//입력부
		System.out.print("이름 = ");
		name = in.readLine();
		
		System.out.println("나이 = ");
		age = in.readLine();
		
		//출력부
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("이름 : " + age +"세");
		
		
	}

}
