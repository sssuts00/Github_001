package Round_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam_08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//�����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String name = "";
		String age ="";
		
		//�Էº�
		System.out.print("�̸� = ");
		name = in.readLine();
		
		System.out.println("���� = ");
		age = in.readLine();
		
		//��º�
		System.out.println();
		System.out.println("�̸� : " + name);
		System.out.println("�̸� : " + age +"��");
		
		
	}

}
