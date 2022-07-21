package string;

import java.util.Scanner;

public class Practicestring01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);




		String str1 = input.nextLine();
		
		if(str1.contains(" ")) {

			String[] result = str1.split(" ");

			System.out.println("성 : " + result[0]);
			System.out.println("이름 : " + result[1]);
		}
		else {
			System.out.println("에러입니다.");
		}



	}
}


