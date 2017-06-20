package Round_08;

import java.io.IOException;
import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) throws IOException {
		// 주민번호 검증 예제
		Scanner sc = new Scanner(System.in);
		String name = null;
		int[] jumin = new int[14];
		
		System.out.print("이름 = ");
		name = sc.next();
		
		System.out.print("주민번호 = "); 
		for(int i=0; i<jumin.length; ++i){
			jumin[i] = System.in.read()-48; // 주민번호를 1개씩 입력받아 jumin배열에 집어넣는다. -48은 숫자 값으로 받기 위해///
		}
		
		//-------------------------------- 주민번호 확인 공식-----------------------------------
		int hap = 0;
		int cre = 2;
		for(int i=0; i<=12; ++i){
			if(i == 6){continue;}
			hap += jumin[i]*cre;
			cre++;
			if(cre == 10) {cre = 2;}
		}
		
		/*hap += jumin[0]*2;
		hap += jumin[1]*3;
		hap += jumin[2]*4;
		hap += jumin[3]*5;
		hap += jumin[4]*6;
		hap += jumin[5]*7;
		
		hap += jumin[7]*8;
		hap += jumin[8]*9;
		hap += jumin[9]*2;
		hap += jumin[10]*3;
		hap += jumin[11]*4;
		hap += jumin[12]*5;*/
		
		float temp = (int)(hap/11.0f * 11.0f + 11.0f-hap);
		float temp1 = temp - (int)(temp / 10.0f)* 10.0f;
		if(temp1 == jumin[13]){
			System.out.println("올바른 주민번호입니다.");
		}else {
			System.out.println("올바르지 않은 주민번호 입니다.");
		}
		
		//-------------------------------- 주민번호 확인 공식-----------------------------------
		
		
		System.out.println();
		System.out.println("name = " + name);
		System.out.print("jumin :");
		for(int i=0; i<jumin.length; ++i){
			/*if(i == 6){
				System.out.print('-');
				continue; //-3을 건너뛰고 -를 출력하게한다...
			}*/
			System.out.print(jumin[i]);
		}
	}
	/*
	 * 주민번호 입력시 111111-111118 을 하면  jumin :111111-3111118 으로 출력 
	 * 이유는 -를 입력때문이다.
	 * 앞자리 6자리는 아스키코드 값을 받아들인다.1의 아스키코드값 49를 입력 받아 49-48을 하면 1을 출력
	 * -는 아스키값이 45이기때문에 45-48을 하여 -3이 출력 된다.
	 * 그래서 if문을 써준다. 주민번호자리가 0부터 시작하기때문에.... 6번째자리를..
	 * if(i == 6){
				System.out.print('-');
				continue; //-3을 건너뛰고 -를 출력하게한다...
			}
	 */
}
