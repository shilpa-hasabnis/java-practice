package NScode;

import java.util.Arrays;
import java.util.Scanner; 

class common {
	public static void main (String[] args) {
          Scanner input = new Scanner(System.in);
		  int test = input.nextInt();
		  String str[] = new String [test];
		  for(int i = 0 ; i < test ; i++){
			 
			   str[i] = input.next();
		  }
		  String min=str[0];
		  for(int i=1;i<test;i++) {
			  if(min.length()>str[i].length()) {
				  min=str[i];
			  }
		  }
		  int count=0;
	
			if(min.length()>0) {
			  for(int i=0;i<test;i++) {
				  for(int j=0;j<min.length();j++) {
					  if(min.charAt(j)==str[i].charAt(j)) {
						  count++;
					  }
				  }
			  }
			  count=count/test;
		  System.out.print(min.substring(0,count));
		  }else {
			  System.out.print(-1);  
		  }
	}
}
