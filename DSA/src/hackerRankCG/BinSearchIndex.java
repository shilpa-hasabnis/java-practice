package hackerRankCG;

import java.util.Arrays;

public class BinSearchIndex {
	public static void main(String[] args) {
		int[] A= {3,5,5,3,3,5};
		int b=solution(A);
		System.out.println(b);
	}

	private static int solution(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				}
		}
		}
		return count;
	}
}
