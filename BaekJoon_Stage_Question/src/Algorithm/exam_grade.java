/*exam grade*/
package Algorithm;

import java.util.Scanner;

public class exam_grade {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int grade = kb.nextInt();
		
		if(grade>=90 && 100>=grade) {
			System.out.println("A");
		}
		else if(grade>=80 && 89>=grade) {
			System.out.println("B");
		}
		else if(grade>=70 && 79>=grade) {
			System.out.println("C");
		}
		else if(grade>=60 && 69>=grade) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
		
		
		kb.close();

	}

}
