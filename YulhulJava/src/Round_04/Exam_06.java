package Round_04;

import java.io.IOException;

public class Exam_06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//���� �� ���� �Է�
		
		
		System.out.print("Ű���� �ϳ��� �Է��ϼ��� : ");
		char a = (char)System.in.read(); //����1��(1byte)�Է½� �ƽ�Ű�ڵ� ����ȯ. �װ� �ٽ� ���������� ������� char�� ��ȯ
		//int a = System.in.read(); //����1�� �Է½� ���ڷ����
		System.out.println("a = " + a);
		
		/*
		 *	��½� ���� �߳����� �������̴�.
		 *	System.in.read();�� Ű�����Է��� 1���� �޴°����� ���� A�� �Է�1�� ����Ű�� ������ 1�� ��2�� �Է¹ޱ⶧����..
		 *	ù �Է¹޴� System.in.read();���� A�� �Է¹ް� ����Ű�� ó���� ���־�� ...���� ����
		 *	System.out.println("���� �ϳ� ��������");�� ���������� ����ȴ�.
		 *	����Ű ���� \r\n�� �����̹Ƿ�... \r�ѹ� \n�ѹ� �� 2���� ó�����־���Ѵ�.
		 *	�׷���
		 *	System.in.read(); // \r
		 *	System.in.read(); // \n �� �Է����ָ� ���� ó���ȴ�.
		 * 
		 */
				
		//System.in.read(); // \r
		//System.in.read(); // \n
		
		System.out.println("���� �ϳ� �Է¼���");
		int b = System.in.read() - '0';
		System.out.println("b = " + b);
		
		
	}

}
