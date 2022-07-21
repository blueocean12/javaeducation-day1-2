import java.util.Scanner;

public class Practice02_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a ;
		//0~99사이의 점수
		a = input.nextInt();
		
		if( a>=0 && a<=99) {
			if(a>=60) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}
		else {
			System.out.println("예외");
		}
		
		
		if (a>=0 && a<=99 && a>=60) {
			System.out.println("합격");
		}
		else if (a>=0 && a<=99 && a<60) {
			System.out.println("불합격");
		}
		else {
		System.out.println("예외");
		}
		
	}
}
