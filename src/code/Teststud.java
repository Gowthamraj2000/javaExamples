package code;
class Stud{
	int sid;
	String sname;
	void insert(int id , String name) {
		sid = id;
		sname = name;
	}
	void diplay() {
		System.out.println(sid);
		System.out.println(sname);
	}
}
public class Teststud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s =new Stud();
		s.insert(2018, "Gowtham");
		s.diplay();
	}

}
