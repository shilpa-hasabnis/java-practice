package NScode;


	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	public class palidromeStringBuff {
		public static void main (String[] args) throws IOException {
	                      // Your code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	
			StringBuffer sb1 = new StringBuffer(br.readLine());
	        StringBuffer sbf = new StringBuffer(sb1);
			sbf.reverse();
			if(!sbf.equals(sb1)){
				System.out.println(1);
			}
			else{
				System.out.println(1);

			}

			
		}
	}
