package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestC {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		try {
			Scanner sc = new Scanner(new FileReader("c:/aaa.txt"));
			//c:/aaa.txt �� ������ ����� ������ ���������!!!
			
			while (sc.hasNextLine()) {
				String tmp = sc.nextLine();
				System.out.println(tmp);
				
			}
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			
		}
		
	}
}
