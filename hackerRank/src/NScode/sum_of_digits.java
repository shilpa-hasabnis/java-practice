package NScode;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.lang.Math;
	 
	class sum_of_digits
	{
	    // Function to check sum
	    // of digit using recursion
	    static int sum_of_digit(Integer n,Integer m){
	    if(n == 0&& m==0) {
	        return 0;

	    }
        return ((n % 10)*(m%10) + sum_of_digit(n/10,m/10));
	}
	    // Driven Program to check above
	    public static void main(String args[]) throws IOException
	    {
	        Integer num = 0,num2=9;
	        Integer result = sum_of_digit(num,num2);
	        System.out.println(result);
	    }
	}
