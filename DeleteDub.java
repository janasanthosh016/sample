package Test2;

import java.util.ArrayList;

public class DeleteDub {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();

		al.add(18);
		al.add(24);
		al.add(18);
		al.add(25);
		al.add(27);
		al.add(10);
		al.add(24);
		al.add(14);
		al.add(18);
		al.add(12);

		System.out.println("Before Remove Duplicate elements:" + al);

		for (int i = 0; i < al.size(); i++) {

			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}

		}

		System.out.println("After Removing duplicate elements:" + al);

	}

}
