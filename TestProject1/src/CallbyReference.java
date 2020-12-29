package one.TestProject1.src;

public class CallbyReference {
	static int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
	int x=5,y=7;
	int c= sum(x,y);
	System.out.println("sum"+c);
	}

}
