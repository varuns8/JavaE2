package basic;

public class Prime100 {

	public static void main(String[] args) {
		int counter=0;
		for(int i=2;i<=100;i++) { //range between 2to100.
			counter=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					counter++;
				}
			}
			if (counter==2) {
				System.out.println("Prime Number: " +i);
			}
		}
		
	}

}
