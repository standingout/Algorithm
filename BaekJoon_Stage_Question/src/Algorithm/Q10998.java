package Algorithm;

import java.util.Scanner;

public class Q10998 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = mul(a,b);
		
		kb.close();
		
		System.out.println(result);

	}
	
	public static int mul(int n, int m) {
		int res = n*m;
		return res;
	}

}
