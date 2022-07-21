package string;

public class fileEqual {

	public static void main(String[] args) {
		String a = "hello";
		String b = new String("hello");
		System.out.println(a.equals(b));
		System.out.println(a == b); // 이렇게 하면 오답!
	}

}
//두 개의 문자열이 서로 동일한지 비교