package Test2;

public class Plain1 {
	public static void main(String[] args) {
		String name="KANNAN";
		
		String name_1="";
		for(int i=name.length()-1;i>=0;i--) {
			 name_1=name_1+name.charAt(i);
			
		}
		System.out.println(name_1);
	}

}
