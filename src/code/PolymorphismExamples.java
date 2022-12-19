package code;
//polymorphism in method overloading
class Addition{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class PolymorphismExamples {

	public static void main(String[] args) {
		Addition A = new Addition();
		System.out.println(A.add(10,20,30));
		System.out.println(A.add(40,56));

	}

}
