package Round_10;

import java.util.Scanner;

class Exam_08_Sub{
	
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private int age;
	
	public Exam_08_Sub() {
		name = "";
		age = 0;
	}
	
	public void setName(){
		System.out.print("�̸� = ");
		name = sc.nextLine();
	}
	
	public void setAge(){
		System.out.print("���� = ");
		age = sc.nextInt();
	}
	
	public void disp(){
		System.out.println(name + "��!");
		System.out.println("����� "+ age +"�� �̽ñ���!");
	}
}

public class Exam_08 {

	public static void main(String[] args) {
		Exam_08_Sub ex = new Exam_08_Sub();
		ex.setName();
		ex.setAge();
		ex.disp();

	}

}
