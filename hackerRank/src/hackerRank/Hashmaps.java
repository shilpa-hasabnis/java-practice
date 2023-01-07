package hackerRank;

	//Complete this code or write your own from scratch
	import java.util.*;
	import java.io.*;

	public class Hashmaps {
		public static void main(String []argh)
		{   Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
			HashMap<String,Integer> nums= new HashMap<String,Integer>();
	        for(int i=0;i<N;i++){
	            String a=sc.nextLine();
	            int b=sc.nextInt();
	            sc.nextLine();
	            nums.put(a,b);
	           System.out.println(a + b);

	        }
            System.out.println(nums);


		}
	}


