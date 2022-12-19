package code;


public class InterfaceExamples implements Int1 {
	public void display1()
	{
		System.out.println("Abst meth");
	}

	public static void main(String[] args) {
		InterfaceExamples d = new InterfaceExamples();
		d.display1();

	}

}
