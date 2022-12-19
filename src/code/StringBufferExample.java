package code;

public class StringBufferExample {

	public static void main(String[] args) {
		// stringbuffer is mutuable
		StringBuffer s = new StringBuffer("java");
		s.append("prog");
		System.out.println(s);
	}

}
