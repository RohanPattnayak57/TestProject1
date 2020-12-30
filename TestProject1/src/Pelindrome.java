package one.TestProject1.src;

public class Pelindrome {

	public static void main(String[] args) {
		int no=134;
		int t1=no;
		int reminder;
		int rev=0;
		while(t1!=0) {
			reminder=t1%10;
			rev=rev*10+reminder;
			t1=t1/10;
		}
		if(rev==no) {
			System.out.println(no+" is a pelindrome number");
		}
		else {
			System.out.println(no+" is not a pelindrome number");
		}
	}

}
