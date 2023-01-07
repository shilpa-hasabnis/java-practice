package NScode;


	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	public class palindromenums {
		public static void main (String[] args) {

			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int i,j;
			
			String str=sc.next();
			//long size=str.length();

			char[] string= str.toCharArray();

			char[] rev=new char[str.length()];

			for( i=str.length(),j=0 ;j<str.length() && i>0; i--,j++){
				rev[j]= string[i];
			}	
			rev.toString();
			str.toString();
			
			
			if(rev.equals(str)){
				System.out.println(1);
			}
			else{
				System.out.println(0);

			}

			
		}
	}