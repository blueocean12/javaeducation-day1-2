package string;

public class Practice01 {

	public static void main(String[] args) {

		int arr[] = new int[10];

		for (int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i=0; i<arr.length; i++) {
		
		 if (arr[i]%2==0) {
			System.out.println(arr[i]);
	
		 }
		 
		}

	}
}