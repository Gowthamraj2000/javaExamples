package oop;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks(1 to 100):");
		mark = scanner.nextInt();
		if (mark>100) {
		 System.out.println("Invalid");
		}
		else if (mark>=90) {
				System.out.println("A Grade");
		}
		else if (mark>=80){
		 System.out.println("B Grade");
		}
		else if (mark>=70) {
		System.out.println("C Grade");
		}
		else if (mark>=60) {
		System.out.println("D Grade");
		}
		else { 
		System.out.println("F Grade");
		}
	

	}

}
