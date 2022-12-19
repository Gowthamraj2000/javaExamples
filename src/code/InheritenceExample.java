package code;

class Emp {
	float salary = 40000f;
}

public class InheritenceExample extends Emp {
	float bonus = 4000f;

	public static void main(String[] args) {
		// A- paraent class/super class/ base
		// B- child calss/ sub class/ derived
		InheritenceExample p = new InheritenceExample();
		Emp e1 = new Emp();
		System.out.println("Salary =" + e1.salary);
		System.out.println("Bonus =" + p.bonus);
		System.out.println("Salary =" + p.salary);
	}

}
