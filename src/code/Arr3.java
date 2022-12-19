package code;
import java.util.Scanner;
public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array element: ");
		for(int i =0; i<5 ; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("The Number of array elements are: ");
		for(int j=0; j<5 ; j++) {
			System.out.println(a[j]);
			}
		System.out.println("Toyal number of Elements is: "+a.length);
	}

}
