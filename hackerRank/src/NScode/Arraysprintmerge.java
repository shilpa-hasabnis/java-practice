package NScode;

	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	public class Arraysprintmerge {
		public static void main (String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        int b[]=new int[n];
	        for(int i=0;i<n;i++) {
	        	a[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++) {
	        	b[i]=sc.nextInt();

	        }
	        for(int i=0;i<n;i++){
	            System.out.print(a[i]+" "+b[i]+" ");
	        }
		}
	}

