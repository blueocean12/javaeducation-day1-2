package string;

public class Practice12 {

	public static void main(String[] args) {
		
		
		for (int i=0; i<3 ; i++) {
			for(int k=i;k<2;k++) {
				System.out.print(" ");
			}
			for(int j =0 ; j<2*i+1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for (int i=0; i<2 ; i++) {
			for(int k = 0; k<=i;k++) {
				System.out.print(" ");
			}
			
			for(int j = i ; j <3-i  ; j++) {
				
				System.out.print("*");
				
				
			}
			System.out.println();
		}
	}

}
