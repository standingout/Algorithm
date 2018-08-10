package Algorithm;

import java.util.Scanner;

public class Star_Code3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.close();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n; j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");					
			}
			System.out.println();
		}

	}

}
