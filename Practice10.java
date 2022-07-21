package string;

public class Practice10 {

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
		
	}

}
