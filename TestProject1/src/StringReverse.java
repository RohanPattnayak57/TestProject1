package one.TestProject1.src;

public class StringReverse {
	public static void main(String args[]){
		String rev="";
		String s="tarini";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		}
}
