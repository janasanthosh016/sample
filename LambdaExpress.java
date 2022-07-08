package Test2;

import java.util.ArrayList;

public class LambdaExpress {

	public static void main(String[] args) {
		int num1 = 10;
		System.out.println("Hello");
		ArrayList<Integer> num = new ArrayList<>();
		for (int i = 1; i <= num1; i++) {
			num.add(i);
		}
		num.forEach((s) -> System.out.print(s));
	}

}
