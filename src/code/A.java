package code;

public interface A {
	default void msg()
	{
		System.out.println("msg() in Int A");
	}
}
