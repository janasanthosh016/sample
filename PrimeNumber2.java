package Test2;

public class PrimeNumber2 {
	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not A Prime nNumber");
		}
	}
}
