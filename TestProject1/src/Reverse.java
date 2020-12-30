package one.TestProject1.src;

public class Reverse {

	public static void main(String[] args) {
		int no=123456789;
		int reminder;
		int reverse=0;
		while(no!=0) {
		reminder=no%10;
		reverse=reverse*10+reminder;
		no=no/10;
	}
System.out.println(reverse);
}}
