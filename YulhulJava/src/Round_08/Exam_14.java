package Round_08;

public class Exam_14 {

	public static void main(String[] args) {
		// int[][] a = new int [3][2];
		// int[][] a = new int [][] {{1,2,3,},{4,5,}};
		int [][] a = new int[3][];
		a[0] = new int[4];
		a[1] = new int[6];
		a[2] = new int[2];
		
		System.out.println("a.length = " + a.length);
		System.out.println("a[0].length = " + a[0].length);
		System.out.println("a[1].length = " + a[1].length);
		System.out.println("a[2].length = " + a[2].length);
		
		for(int i=0; i<a.length; ++i){ //a.length => 3
			for(int j=0; j<a[i].length; ++j){ // a[i].length => 2
				System.out.println("a["+ i +"]["+ j +"]= " + a[i][0]);
			}
			
		}
		

	}

}
