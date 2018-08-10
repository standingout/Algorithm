package Algorithm;

import java.util.Scanner;

public class three_num {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		if(a>b && b>c) {
			System.out.println(b);
		}
		else if(a<b && b<c) {
			System.out.println(b);
		}
		else if(b>a && a>c) {
			System.out.println(a);
		}
		else if(c>a && a>b) {
			System.out.println(a);
		}
		else if(a>c && c>b) {
			System.out.println(c);
		}
		else if(a<c && c<b) {
			System.out.println(c);
		}
		else if(a==b && b>c) {
			System.out.println(b);
		}
		else if(a==b && b<c) {
			System.out.println(b);
		}
		else if(a==c && b>c) {
			System.out.println(a);
		}
		else if(a==c && b<c) {
			System.out.println(a);
		}
		else if(a==b && a==c) {
			System.out.println(a);
		}
		else if(a>b && b==c) {
			System.out.println(b);
		}
		else if(a<b && b==c) {
			System.out.println(b);
		}
		else if(a>c && b==a) {
			System.out.println(c);
		}
		else if(a<c && b==c) {
			System.out.println(c);
		}
		
		kb.close();

	}

}
