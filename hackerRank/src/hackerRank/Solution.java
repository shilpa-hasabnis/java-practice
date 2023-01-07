package hackerRank;
import java.io.*;

import java.util.*; import java.lang.Math;

public class Solution { 
	public static int percent(String A, String B){
		int count=0;
		char[] a= A.toCharArray();
		char[] b=B.toCharArray();
		int aa=a.length;

		for(int i=0;i<a.length;i++){
			if(a[i]==b[i]){
				continue;
			}else{
				count++;
			}
		}
		int ans=(count/aa)*100;
		return(ans);


	}


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String A;

		A=scan.next();

		String B;

		B=scan.next();

		int result;

		result = percent (A,B);

		System.out.print (result);

		return;

	}

}