package Test2;

public class StringImp1 {
	public static void main(String[] args) {
		String name1 = "ram";
		String name2 = "ram";

		System.out.println(name1 + " , " + name2);

		String word = "California";
		String word1 = word;
		String word2 = word;
		word = "New Yark";
		System.out.println(word + " , " + word1 + " , " + word2);
		
		StringBuilder name=new StringBuilder();
		name.append("Kannan is a Good");
		StringBuilder name3=name;
		StringBuilder name4=name;
		name.append("Boy");
		System.out.println(name+" , "+name3+" , "+name4);
	}

}