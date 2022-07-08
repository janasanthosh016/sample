package Test2;

public class ArrayBigNumber {
	public static void main(String[] args) {
		int[] number = { 23, 45, 6, 56, 98, 3, 1 };
		int maxNumber1 = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > maxNumber1) {
				maxNumber1 = number[i];
			}
		}
		System.out.println(maxNumber1);
	}

}
