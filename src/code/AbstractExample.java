package code;

abstract class mydemo {
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Non-abst meth");
	}

	public abstract void display2();
}

public class AbstractExample extends mydemo {
	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("abst meth");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractExample d = new AbstractExample();
		d.display1();
		d.display2();

	}

}
