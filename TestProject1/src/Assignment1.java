package one.TestProject1.src;
import java.util.Scanner;


public class Assignment1 {
	     
	        public static void main(String[] args) {
	            Scanner scan=new Scanner(System.in);
	            System.out.println("enter the number:");
	            int a=scan.nextInt();
	            String print="";
	            if(a%2==1){
	              print = "weird";
	            }
	            else {
	                if (a >= 2 && a <= 5) {
	                    print = "Not weird";
	                } else if (a >= 6 && a <= 20) {
	                    print = "weird";
	                } else {
	                    print = "Not weird";
	                }
	            System.out.println(print);   
	        }
	        }
}
