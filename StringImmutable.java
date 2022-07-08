package Test2;

public class StringImmutable {
	public static void main(String[] args) {
		String name="Kannan";
		String name1="Suji";
		name.concat(name1);
//		name=name*name1; it store in name,but it only display Kannan;
		System.out.println(name);
	}
} 
