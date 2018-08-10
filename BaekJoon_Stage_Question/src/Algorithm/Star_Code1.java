/*Star_code1*/
package Algorithm;

import java.util.Scanner;

public class Star_Code1 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.close();
		
		for(int i=n; i>0; i--) {
			for(int j=1;j<n+1;j++) {
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
