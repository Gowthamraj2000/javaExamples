package code;

public class MethodOverloading2 {
	static void test() {
		System.out.println("test method with no argument");
	}
	static void test(int a) {
		System.out.println("test method with 1 arg");
	}
	static void test(int a, int b) {
		System.out.println("test method with 2 arg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test(2,5);
		test(3);
	}

}
