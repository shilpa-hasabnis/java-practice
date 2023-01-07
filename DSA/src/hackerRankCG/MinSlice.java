package hackerRankCG;
import java.util.*;
public class MinSlice {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //4
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();//1 2 3 4
		}
		int ret=Solution.solution(arr);
		System.out.println(ret);
	}

}
class Solution { 
	public static int solution(int[] arr) {
	List<Integer> li= new ArrayList<>();
	for(int i=0;i<arr.length;i++) { 
		for(int j=i+1;j<arr.length-1;j++) {
			sums(i,j,li);
		}
	}
	int min=Collections.min(li);
	return min;
	}

	private static void sums(int i, int j, List<Integer> li ) {
		// TODO Auto-generated method stub
		int temp=Math.abs(i+j);
		li.add(temp);

	}

}
