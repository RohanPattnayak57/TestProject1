package one.TestProject1.src;

public class Function {
	static void abc(int[]a) {
		int t=a[0];
		a[0]=a[1];
		a[1]=t;
		}
	public static void main(String[] args) {
		int a[]= {20,20};
        abc(a);
        for(int i=0;i<=1;i++) {
        	System.out.println(a[1]);
        }
        
	}
}

