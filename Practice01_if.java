import java.util.Scanner;

public class Practice01_if {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		a = input.nextInt();
		b = input.nextInt();
		
		if (a>b) {
			System.out.println(a-b);
		}
		else {
			System.out.println(b-a);
		}
		
		
		
	}

}
