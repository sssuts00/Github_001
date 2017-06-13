package Round_04;

import java.io.*;

public class Exam_09 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		String imsi = "";
		byte a = 0;
		int b = 0;
		float c = 0.0f;
		
		
		System.out.print("수를 입력하세요 : ");
		imsi = in.readLine();
		
		a = Byte.parseByte(imsi); //레퍼클래스 입력받은 값을 숫자형으로 변환
		b = Integer.parseInt(imsi);
		c = Float.parseFloat(imsi);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}

}
