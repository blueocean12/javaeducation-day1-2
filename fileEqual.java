package string;

public class fileEqual {

	public static void main(String[] args) {
		String a = "hello";
		String b = new String("hello");
		System.out.println(a.equals(b));
		System.out.println(a == b); // �̷��� �ϸ� ����!
	}

}
//�� ���� ���ڿ��� ���� �������� ��