package one.TestProject1.src;

public class Area {
		int lenght;
		int width;
		void insertArea(int l,int w){
			lenght=l;
			width=w;
		}
		void calculateArea(){System.out.println(lenght*width);}
			public static void main(String args[]) {
				Area r1=new Area(),r2=new Area();
				  r1.insertArea(11,5);  
				  r2.insertArea(3,15);  
				  r1.calculateArea();  
				  r2.calculateArea();  
			}

		}
