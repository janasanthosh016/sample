package Test2;

public class LargestLengthString {
//	public static void main(String[] args) {
//	String[] a= {"gfhgf","hfgejf","rfjtfgf","sfdfdsfd","gdf" };
//	int max=0;
//	String name="";
//	   for(int i=0;i<a.length;i++) {
//		if(a[i].length()>max) {
//			max=a[i].length();
//			name=a[i];
//		}
//		
//		}
//	   System.out.println(name+" , "+max);
//	}
// to find mini;	
	public static void main(String[] args) {
		String[] b = { "gsddf", "hfgejf", "rfjtfgf", "sfdfdsfd", "gdf" };
		int mini = b[0].length();
		String name1 = "";
		for (int i = 0; i < b.length; i++) {
			if (b[i].length() < mini) {
				mini = b[i].length();
				name1 = b[i];
			}
		}
		System.out.println(name1 + " , " + mini);
	}

}
