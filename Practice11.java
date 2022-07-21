package string;

public class Practice11 {

	public static void main(String[] args) {
		
		for (int i=0; i<3 ; i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j =i ; j<5-i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
