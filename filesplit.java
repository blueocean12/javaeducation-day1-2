package string;

public class filesplit {

	public static void main(String[] args) {
		String a = "a:b:c:d";
		String[] result = a.split(":");
		for(int i = 0; i<result.length; i++) {
		System.out.println(result[i]);
		}

	}

}
//전부 대문자