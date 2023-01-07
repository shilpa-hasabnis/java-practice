package hackerRank;
import java.util.*;
import java.io.*;

public class hackerRankHashmap {
	//Complete this code or write your own from scratch
	
		public static void main(String []argh)
		{   Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        sc.nextLine();
			HashMap<String,Integer> nums= new HashMap<String,Integer>();
	        for(int i=0;i<N;i++){
	            String a=sc.nextLine();
	            int b=sc.nextInt();
	            sc.nextLine();
	            nums.put(a,b);
	            
	        }
	        
	        System.out.println(nums);
	        
	        while(sc.hasNext()) {
	        	String ns=sc.nextLine();
	        	try {
	        		int number=nums.get(ns);
	        		System.out.println(ns+"="+number);
	        	}
	        	catch(Exception e){
	        		System.out.println("Not Found");
	        	}
	        }
		}
	}





