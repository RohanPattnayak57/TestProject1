package one.TestProject1.src;
import java.util.Scanner;

public class ArmstrongScanner {

	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     System.out.println("enter the number");
	     int no=s.nextInt();
	    int length=0;
		int t1=no;
		while(t1!=0) {
			length=length+1;
			t1=t1/10;
		}
		int t2=no; 
		int reminder;
		int a=0;
		while(t2!=0) {
			int mult=1;
			reminder=t2%10;
			for(int i=1;i<=length;i++) {
				mult=mult*reminder;
			}
			   a=a+mult;			
				t2=t2/10;
			}
			if(a==no) {
				System.out.println(no+ " is a armstrong number");
			}
			else {
				System.out.println(no+ " is not a armstrong number");
			}
		
	}
	}

