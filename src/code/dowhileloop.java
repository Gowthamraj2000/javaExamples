package code;

import java.util.Scanner;

public class dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many stars do you want:");
		n = scanner.nextInt();
		while (i <= n) {
			System.out.print("*");
			i++;
		}

	}

}
