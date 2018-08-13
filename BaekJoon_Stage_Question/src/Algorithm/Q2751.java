package Algorithm;

import java.util.Scanner;

public class Q2751 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		
		kb.close();
		
		
		
		for(int i=0; i<n; i++) {
			int tmp = data[i];  			//기준
			int j = i-1; 					//해당키의 왼쪽요소와 비교하므로
			while(j>=0 && data[j]>tmp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = tmp;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}

	}

}
