package code;


abstract class Member{//Abstarct class
	private String name;
	abstract void welcomeMessage(); // abstract Method Declaration
	
	public String getname() {
		return name; //concreat method 
	}
	
}
class Student extends Member {
	void welcomeMessage() {
		System.out.println("Hey Students");//derived Abstract Class Extends
	}
}
class Teachers extends Member {//derived Abstract Class Extends
	void welcomeMessage() {
		System.out.println("welcome Teachers");
		}
	
	}
	


public class AbstractExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Teachers t1 = new Teachers();
		
		//Member m1 = new Student();
		
		Member[] m = new Member[4];
		m[0] = new Student();
		m[1] = new Student();
		m[2] = new Teachers();
		m[3] = new Teachers();
		
		for(Member m1: m) {
			m1.welcomeMessage();
		}
	}

}
