package NScode;

	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	public class towerHannoi {
		public static void main (String[] args) {
	                      // Your code here
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int i=1;
			for(i=1;i<n;i++){
				if(i!=n){
					System.out.println(i+":A->B");
				}
			}
				System.out.println(i+":A->C");
				i--;
				while(i>=1){
					System.out.println(i+":B->C");
					i--;
				}

			}
		}
	///It is wrong
	
