package one.TestProject1.src;

public class Primenumber {

	public static void main(String[] args) {
		int no=6,temp=0;
			for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				temp=temp+1;
			}	
		}
		if(temp>0) {
			System.out.println("its not a prime number");
		}
			else {
				System.out.println("its a prime number");
		}
	}

}
