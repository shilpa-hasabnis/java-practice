package recursions;

import java.util.Scanner;

public class TowerOfHannoi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		annoi(n,'A','B','C');
	}
	public static void annoi(int n,char A,char B,char C) {
		if(n==0) {
			return;
		}
		annoi(n-1,A,C,B);
		System.out.println(n+":"+A+"->"+C);
		annoi(n-1,B,A,C);
	}
}
