package Algorithm;

import java.util.Scanner;

public class Q10430 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		kb.close();
		
		System.out.println(div1(a,b,c));
		System.out.println(div2(a,b,c));
		System.out.println(div3(a,b,c));
		System.out.println(div4(a,b,c));
		
		

	}
	
	public static int div1(int x, int y, int z) {
		int res = ((x+y)%z);
		return res;
	}
	public static int div2(int x, int y, int z) {
		int res = (x%z + y%z)%z;
		return res;
	}
	public static int div3(int x, int y, int z) {
		int res = (x*y)%z;
		return res;
	}
	public static int div4(int x, int y, int z) {
		int res = (x%z * y%z)%z;
		return res;
	}
}
