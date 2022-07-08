package Test2;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int[] number= {45,42,-5,1,0,11,2,4,3,7,2};
		for(int i=0;i<number.length;i++) {
			
		if(number[i]!=2 && number[i]%2==0 || number[i]!=3 && number[i]%3==0 || number[i]==1 ) {
		
			System.out.println(number[i]+" This number is Not A Prime");
		}
			
		else {
			System.out.println(number[i]+" This is A Prime");
		}
}
	}

}

