package one.TestProject1.src;

import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = r.nextInt();
        for (int i= 0; i<rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }
        r.close();
 
    }
}