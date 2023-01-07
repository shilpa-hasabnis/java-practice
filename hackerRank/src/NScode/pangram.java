package NScode;


	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	public class pangram {
		public static void main (String[] args) {
	                      // Your code here
			Scanner sc=new Scanner(System.in);
			int n =sc.nextInt();
			for(int j=0;j<n;j++){
			String str=sc.next();
			
			String sph=str.toLowerCase();
			boolean present=true;
			//char[] al= str.toCharArray();

			for(char i='a';i<='z';i++){
				if(sph.contains(String.valueOf(i))){
					present= false;
				}

			}
			if(present){
			System.out.println("");

			}else{
				System.out.println(0);

			}

			}
		}
	}