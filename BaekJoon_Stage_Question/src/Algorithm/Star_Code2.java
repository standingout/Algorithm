package Algorithm;

import java.util.Scanner;

public class Star_Code2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.close();
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
