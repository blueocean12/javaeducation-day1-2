package string;

import java.util.Scanner;

public class Practicestring01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);




		String str1 = input.nextLine();
		
		if(str1.contains(" ")) {

			String[] result = str1.split(" ");

			System.out.println("�� : " + result[0]);
			System.out.println("�̸� : " + result[1]);
		}
		else {
			System.out.println("�����Դϴ�.");
		}



	}
}


