package one.TestProject1.src;

public class Calc{
		public static void main(String[] args) {
				int no1=10,no2=5,res;
				String sym="*";
				switch(sym)
				{
					case "+":res=no1+no2;
					System.out.println(res);
					break;
					case "-":res=no1-no2;
					System.out.println(res);
					break;
					case "*":res=no1*no2;
					System.out.println(res);
					break;
					case "/":res=no1/no2;
					System.out.println(res);
					break;
					default:System.out.println("invalid sysmbol");
					break;
				}
		}
	}
