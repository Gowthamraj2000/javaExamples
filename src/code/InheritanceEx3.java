package code;
class Employee{
	
	private String name;
	private double salary;
	private String join_date ;
	Employee(String n, double s,String d){
		name = n;
		salary = s;
		join_date = d;
		
	}
	
//	Employee(){
//		name = " ";
//		salary = 0.0;
//	}

	public String getName() {
		return name;
	}
	public void setName(String n) {
		name =n;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double s) {
		salary = s;
	}
	public void raiseSalary(double percent) {
		salary += salary*percent/100;
	}
	public String getDate() {
		return join_date;
	}
	public void setDate(String d) {
			join_date = d;
	}
	public void Dispaly(){
		System.out.println("Name of the Employee is "+name+ "\nsalary is :"+salary +"\njoining date of employee is : "+ join_date);
		}
}
class Manager extends Employee{
	double bonus;
	
	Manager(String n,double s, String d,double b){
		super(n,s,d);
		bonus = b;
		}
	public void setBonus(double b){
		bonus = b;
	} 
	public double getSalary() {
		return super.getSalary()+bonus;
	}
	public void Display() {
		super.Dispaly();
		double total_salary =getSalary();
		System.out.println("Bonus amount is :"+bonus+"\nTotal salary is : "+total_salary);
	}
}
public class InheritanceEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ram",35000,"12/12/2022");
		e1.raiseSalary(10);
		///System.out.println(e1.getSalary());
//		double salary=35000,percent=10;
//		salary += salary*percent/100;

		Manager m1 = new Manager("Jhon",65000.0,"20/12/2022",20000);
		//m1.setBonus(1000);
		//System.out.println(m1.getSalary());
		e1.Dispaly();
		
		
		
		Employee e2 = new Manager("ramcharan",30000,"01/04/2020",30000);//polymorphism
		
		int arr[] = new int[50];
		Employee[] employee = new Employee[5];
		employee[0]= new Employee("Sam",45000,"01/11/2021");
		employee[1]= new Employee("Ramya",35000,"05/10/2021");
		employee[2]= new Employee("Samy",75000,"03/09/2021");
		employee[3]=new Manager("vicky",20000,"03/08/2019",4000);
		employee[4]= new Manager("Jhon",65000.0,"20/12/2022",20000);
		
//		employee[4].setSalary(75000);
//		Manager m1 = (Manager) employee[2];
//		Manager m2;
//		if(employee[3] instanceof Manager) {
//		m2= (Manager) employee[3];
//		}
		//m2.setBonus(3000);
		
		for (Employee e : employee) {//dynamic binding
			System.out.println(e.getName()+" "+e.getSalary());
		}
		m1.Display();
	}

}
