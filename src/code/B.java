package code;

public interface B {
	default void msg() {
		System.out.println("mes() in Int B");
	}
}
