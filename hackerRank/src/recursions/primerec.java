package recursions;

import java.io.*; 
import java.util.*;
public class primerec {
	public static int reduction (int val) {
		int num=2;
		while(num<val) {
			while(val%num==0) {
				if(val==num) {
					break;
				}
				val/=num;
			}
			num++;
		}
		return num;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int n=0;
		int count=0;
		n=reduction(d);
		//d--;
		//count++;
		while(n>0) {
			int b=reduction(n);
			
			if(n==b) {
			count++;
				n--;
			}else {
				n--;
				count++;

			}
			//count++;
		}
		System.out.println(n);
		System.out.println(count);
	}

}