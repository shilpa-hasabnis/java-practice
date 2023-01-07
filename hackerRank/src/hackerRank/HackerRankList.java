package hackerRank;

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class HackerRankList {

	    public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	          List<Integer> list= new ArrayList<>();
	       Integer N= sc.nextInt();

	       for(int i=0;i<N;i++){

	            int temp=sc.nextInt();
	            list.add(temp);
	       }
	       System.out.println(list);
	       
	       int n=sc.nextInt();
	       for(int i=0;i<n;i++){
	           String op=sc.next();

	               
	              if(op=="Insert"){
	                   int a=sc.nextInt();
	                   int b=sc.nextInt();
	                   list.add(a,b);
	                   System.out.println(list);
	               }
	               else{
	                   int c=sc.nextInt();
	                   list.remove(c);
	                   System.out.println(list);
	               }
	            
	           
	       }
	    }
	}

