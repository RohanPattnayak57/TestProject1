package one.TestProject1.src;

public class FunctionOverloading {
       
	static  int sum(int a,int b) {
			return a+b;
		}
	static  int sum (int a,int b,int c) {
		  return a+b+c;
	}
	  static int sum (int a,int b,int c, int d) {
		  return a+b+c+d;
	  }
	  public static void main(String[] args) {
		  int c=sum(2,4,6);
		  System.out.println("sum="+c);
	  }

}
