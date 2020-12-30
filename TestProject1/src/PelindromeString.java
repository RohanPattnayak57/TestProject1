package one.TestProject1.src;

public class PelindromeString {

	public static void main(String[] args) {
		String rev="";
		String s="tarini";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println(s+" is a pelindrome string");
		}
			else {
				System.out.println(s+ " is not a pelindrome string");
		}

	}
	}
