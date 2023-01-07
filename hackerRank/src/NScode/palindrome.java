package NScode;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class palindrome {
	public static void main (String[] args){
        // Your code here
Scanner sc= new Scanner(System.in);

String number = ""; 
if(sc.hasNext()){
	number= sc.next();
}
String reverse="";
String curr=number;

for ( int i = number.length() - 1; i >= 0; i-- )  
	{  
	reverse = reverse + number.charAt(i);  

				System.gc(); //garbage collector for mle error

	}  

if(curr.equals(reverse)){
	System.out.println(1);
}
else{
	System.out.println(0);

}

}
}