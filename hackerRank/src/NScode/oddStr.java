package NScode;


	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	public class oddStr {
		public static void main (String[] args) {
	                      // Your code here
			Scanner sc =new Scanner(System.in);
			String str=sc.next();
			char[] c=str.toCharArray();
			for(int i=0;i<str.length();i++){
				if(i%2!=0){
					System.out.print(c[i]+" ");
				}
			}


		}
	}
