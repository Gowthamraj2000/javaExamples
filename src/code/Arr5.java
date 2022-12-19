package code;
import java.util.Scanner;
public class Arr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row,col;
		int a[][]  = new int[3][3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter max 2 no:");
		row = s.nextInt();
		System.out.println("enter max 2 no:");
		col = s.nextInt();
		
		System.out.println("Enter "+(row*col)+"the array elements: ");
		for(i=0; i<row; i++) {
			for( j=0;j<col;j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.print("The araay elements are: \n ");
		for( i=0; i<row; i++) {
			for( j=0; j<col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
