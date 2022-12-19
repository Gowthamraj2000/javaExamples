package code;

class Box {
	int length;
	int breath;
	int height;

	int volume() {
		return length * breath * height;
	}
}

public class classdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box blackBox = new Box();

		blackBox.length = 10;
		blackBox.breath = 8;
		blackBox.height = 6;

		System.out.println("volume of blackbox is " + blackBox.volume()); // invoke

		Box whiteBox = new Box();

		whiteBox.length = 10;
		whiteBox.breath = 30;
		whiteBox.height = 6;

		System.out.println("volume of whitebox is " + whiteBox.volume());

	}

}
