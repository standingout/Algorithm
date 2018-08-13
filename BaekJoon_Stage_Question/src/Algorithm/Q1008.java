package Algorithm;

import java.util.Scanner;

public class Q1008 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double a = kb.nextInt();
		double b = kb.nextInt();
		
		kb.close();
		double div = div(a,b);
		
		System.out.println(div);


	}
	
	public static double div(double n, double m) {
		double result;
		result = n/m;
		
		return result;
	}

}
