package arrays;
import java.util.*;
public class Anagrams {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String one=sc.nextLine();
		String two=sc.nextLine();
		System.out.println(isItAnagram(one,two));
	}

	private static int isItAnagram(String one, String two) {
		int[] num1=counts(one);
		int[] num2=counts(two);
		int dif=diff(num1,num2);
		return dif;
	}

	private static int diff(int[] one, int[] two) {
		int diffs=0;
		for(int i=0;i<26;i++) {
				int differ=Math.abs(one[i]-two[i]);
				diffs+=differ;
		}
		return diffs;
	}

	private static int[] counts(String one) {
		int[] countchar=new int[26];
		for(int i=0;i<one.length();i++) {
			char ns=one.charAt(i);
			int offset=(int) 'a';
			int val=ns-offset;
			countchar[val]++;
		}
		return countchar;
	}

}
