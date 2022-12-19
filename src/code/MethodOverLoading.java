package code;

public class MethodOverLoading {
	static int max(int a,int b) {
		return a>b?a:b;
	}
	static double max(double a,double b) {
		return a>b?a:b;
	}
	static int max(int c,int d,int e) {
		return c+d+e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(5,7));
		System.out.println(max(5.6,4.7));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-4.7));
	}

}
