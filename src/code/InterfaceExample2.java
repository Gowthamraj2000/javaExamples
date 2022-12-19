package code;

public class InterfaceExample2 implements A,B{
	public void msg() {
		A.super.msg();
		B.super.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample2 obj = new InterfaceExample2();
		obj.msg();
	}

}
