package string;

public class Practice13 {

	public static void main(String[] args) {
//		숫자 10개 배열

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ "\t");
		}
		System.out.println();
		
		for(int i=0; i<arr.length;i++) {
			
			if (arr[i]%2==1) {
				arr[i]=arr[i]+2;
			}
		}
		
		System.out.println();
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ "\t");
		}
		System.out.println();
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		System.out.println((double)sum/arr.length);
		
			
	}

}
