package one.TestProject1.src;

import java.util.Scanner;

public class Calc2 {
	public static void main(String args[]) {
		String yn; 
		do {
	Scanner s=new Scanner(System.in);
	System.out.println("enter first no.");
	int no1=s.nextInt();
	System.out.println("enter second no.");
	int no2=s.nextInt();
	System.out.println("Select symbol(+,-,*,/)");
	String symbol=s.next();
	int result;
	switch(symbol){
	case "+":result=no1+no2;
	System.out.println("Addition is="+result);
	break;
	case "-":result=no1-no2;
	System.out.println("Subtraction is="+result);
	break;
	case "*":result=no1*no2;
	System.out.println("Multiplication is="+result);
	break;
	case "/":result=no1/no2;
	System.out.println("Division is="+result);
	break;
	default:System.out.println("invalid sysmbol");
	break;
	}
	System.out.println("do u want to continue (press y for yes and n for no)");
	yn=s.next();
		}while(yn.equals("y")||yn.equals("Y"));
}
}
