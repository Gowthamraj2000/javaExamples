package oop;
class BlackBox{
	int length;
	int breadth;
	int height;

	BlackBox(int l, int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	boolean isEqual(BlackBox b) {
		b.length++;
		if(length==b.length && breadth == b.breadth && height == b.height)
			return true;
		else
		return false;
	}
}
public class PassingRefDemo {
	static void increment(int a) {
		a++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		increment(a);
		increment(a);
		System.out.println(a);
		
		BlackBox b1 = new BlackBox(5,3,4);
		BlackBox b2 = new BlackBox(5,3,4);
		
		System.out.println(b1.isEqual(b2));
		System.out.println(b2.length);
	}

}
