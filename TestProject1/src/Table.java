package one.TestProject1.src;

import java.util.Scanner;
public class Table {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("enter the number:");
	        int r = scan.nextInt();
	        for(int i = 1; i <=10; i++)
	        {
	            System.out.println(r+ " x "+i+" = "+i*r);
	        }
	    }
}
