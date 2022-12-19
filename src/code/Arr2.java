package code;
import java.util.Scanner;
public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i =0; i<5 ; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("The Array element are: ");
		for(int i=0; i<5 ; i++) {
			System.out.println(a[i]);
		}
	}

}
