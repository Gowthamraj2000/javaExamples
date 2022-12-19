package code;

class Fox {
	int length;
	int breath;
	int height;// instance variables

	/**
	 * @param l
	 * @param b
	 * @param h
	 */
	Fox(int l, int b, int h) {// constructor
		length = l;
		breath = b;
		height = h;
	}

	void setDem(int l, int b, int h) {// this pointer
		length = l;
		breath = b;
		height = h;
	}

	int volume() {
		return length * breath * height;
	}

	public static class constructors {

		public static void main(String[] args) {
			Fox blackBox = new Fox(2, 4, 6);
			// blackBox.setDem(20,30,60);
			System.out.println("volume of blackbox is " + blackBox.volume());
		}

	}
}
