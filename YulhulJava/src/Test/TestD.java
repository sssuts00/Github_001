package Test;

import java.util.Arrays;

public class TestD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] a = {{1,2},{3,4,5},{6,7,8,9}};
		
		System.out.println(a.length + a[1].length + a[2].length);
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		System.out.println(Arrays.deepToString(a));//다차원 배열 문자열로변환
		System.out.println(Arrays.toString(a[1]));
		System.out.println(Arrays.toString(a[2]));
	}

}
