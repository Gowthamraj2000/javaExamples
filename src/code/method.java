package code;

public class method {
	/*
	 * *method carries out a specific task
	 */
	static int boxVolume(int length, int breath, int height) {// method definition-
		int vol;
		vol = length * breath * height;
		return vol;
	}

	static void printline() {
		System.out.println("---------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("total of boxvolume");// method call
		int volume = boxVolume(10, 4, 6);// passing arguments
		int volume2 = boxVolume(49, 69, 34);
		System.out.println(volume + volume2);
		printline();

	}

}
