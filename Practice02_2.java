import java.util.Scanner;

public class Practice02_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a ;
		//0~99������ ����
		a = input.nextInt();
		
		if( a>=0 && a<=99) {
			if(a>=60) {
				System.out.println("�հ�");
			}
			else {
				System.out.println("���հ�");
			}
		}
		else {
			System.out.println("����");
		}
		
		
		if (a>=0 && a<=99 && a>=60) {
			System.out.println("�հ�");
		}
		else if (a>=0 && a<=99 && a<60) {
			System.out.println("���հ�");
		}
		else {
		System.out.println("����");
		}
		
	}
}
