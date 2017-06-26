package Round_10;
import java.io.*;
public class Exam_09 {
	private BufferedReader in;	
	private int num;
	private int num1;
	private String[][] name;
	public Exam_09(String floor, String room) {
		in = new BufferedReader(new InputStreamReader(System.in));	
		num = Integer.parseInt(floor);//층
		num1 = Integer.parseInt(room);//방
		name = new String[num][num1];
	}
	public void process() throws IOException {
		while(true) {
			System.out.print("1.투숙 2.퇴실 3.전체보기 4.종료 = ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if(x == 1) {				
				int a = 0;
				int b = 0;
				do {					
					System.out.print("몇층에 투숙 = ");
					a = Integer.parseInt(in.readLine());
				} while(a < 0 || a >= num);
				do {					
					System.out.print("몇번방에 투숙 = ");
					b = Integer.parseInt(in.readLine());
				} while(b < 0 || b >= num1);
				System.out.print("투숙객 이름 = ");
				name[a][b] = in.readLine();
			}
			else if(x == 2) {
				int a = 0;
				int b = 0;
				do {
					System.out.print("몇층에서 퇴실 = ");
					a = Integer.parseInt(in.readLine());
				} while(a < 0 || a >= num);
				do {
					System.out.print("몇번방에서 퇴실 = ");
					b = Integer.parseInt(in.readLine());
				} while(b < 0 || b >= num || name[a][b] == null);
				name[a][b] = null;
			}
			else if(x == 3) {
				for(int j = 0; j < name.length; ++j) {
					System.out.println(j + "층!");
					for(int i = 0; i < name[j].length; ++i) {
						System.out.print(i + "번방 투숙객 : " + name[j][i]);
						if(i % 3 == 2) System.out.println();
						else System.out.print("\t");
					}					
					System.out.println();
				}
			}
			else if(x == 4) {
				break;
			}
			else {
				System.err.println("잘못 입력!");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] ar) throws IOException {
		if(ar.length != 2) {
			System.err.println("Usage : java Exam_13 층의개수 방의개수");
			System.exit(0);
		}
		
		Exam_09 ex = new Exam_09(ar[0], ar[1]);
		ex.process();
		
		System.out.println("시스템을 종료!");
	}
}
