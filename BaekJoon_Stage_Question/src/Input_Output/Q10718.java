package Input_Output;

import java.util.Scanner;

public class Q10718 {

	public static void main(String[] args) {


		Scanner kb = new Scanner(System.in);

		while(kb.hasNextLine()){
			String typing = kb.nextLine();
			
			
			if(typing.isEmpty()||typing.length()>100) {
				break;
			}else {
				System.out.println(typing);
			}
		}
		
		kb.close();



	}
}
