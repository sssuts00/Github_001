package Round_04;

import java.io.IOException;

public class Exam_06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//문자 및 숫자 입력
		
		
		System.out.print("키보드 하나를 입력하세요 : ");
		char a = (char)System.in.read(); //문자1개(1byte)입력시 아스키코드 값변환. 그걸 다시 문자형으로 출력위해 char로 변환
		//int a = System.in.read(); //문자1개 입력시 숫자로출력
		System.out.println("a = " + a);
		
		/*
		 *	출력시 값이 잘나오지 않을것이다.
		 *	System.in.read();은 키보드입력을 1개를 받는것으로 문자 A를 입력1개 엔터키를 누르면 1개 총2를 입력받기때문에..
		 *	첫 입력받는 System.in.read();에서 A를 입력받고 엔터키를 처리를 해주어야 ...다음 문장
		 *	System.out.println("수를 하나 누르세요");가 정상적으로 실행된다.
		 *	엔터키 값은 \r\n의 조합이므로... \r한번 \n한번 총 2번을 처리해주어야한다.
		 *	그래서
		 *	System.in.read(); // \r
		 *	System.in.read(); // \n 를 입력해주면 정상 처리된다.
		 * 
		 */
				
		//System.in.read(); // \r
		//System.in.read(); // \n
		
		System.out.println("수를 하나 입력세요");
		int b = System.in.read() - '0';
		System.out.println("b = " + b);
		
		
	}

}
