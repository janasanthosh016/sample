package Test2;

import java.util.ArrayList;
import java.util.List;

public class Delete2 {

	public static void main(String[] args) {
		ArrayList<Integer> cityList = new ArrayList<>();
		cityList.add(45);
		cityList.add(22);
		cityList.add(10);
		cityList.add(30);
		cityList.add(22);
		cityList.add(45);

		ArrayList<Integer> newList = new ArrayList<>();
		for (Integer name : cityList) {
			if (!newList.contains(name)) {
				newList.add(name);
	//	System.out.println(name);
			}
		}
	//	System.out.println(newList);
		for (Integer name : newList) {
			System.out.println("City Number - " + name);
		}
	}
}