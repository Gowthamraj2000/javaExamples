package code;
// polymorphism in method overriding
class Addition2{
	int add(int a, int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
}
public class PolymorphismExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition2 A = new Addition2();
		System.out.println(A.add(10.5f,15.5f));
		System.out.println(A.add(10, 40));
	}

}
