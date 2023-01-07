package NScode;


	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework
	import java.lang.Math;
	public class recPow {
	static double power(double x, int n){
				if(n == 0){
					return 1;
				}
				double b=0.0;
				double a=0.0;
				if(n<0) {
				if(n%2 == 0){
			        return 1 / power(x, -n);
			}
				}
				if(n>0) {
					if(n%2 == 0){
						a =(power(x, n/2) * power(x, n/2));
					}else{
						a =(x * power(x, n/2) * power(x, n/2));
					}
					}
				return a;
			}
			
	public static void main (String[] args) {
	     Scanner scn= new Scanner(System.in);
		 int t = scn.nextInt();
		
		 for(int i=0;i<t;i++) {
			 double x = scn.nextDouble();
			 int n = scn.nextInt();
		 System.out.format("%.2f", power(x,n));
			  System.out.println();
			}
	    }
	}
