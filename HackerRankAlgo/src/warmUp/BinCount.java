package warmUp;
import java.util.*;
public class BinCount {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		li=bin(n);
		li.stream().forEach(System.out::println);
	}

	private static List<Integer> bin(int n) {
		List<Integer> li=new ArrayList<>();
		String binv=Integer.toBinaryString(n);
		for(int i=0;i<binv.length();i++) {
			if(binv.charAt(i)=='1') {
				li.add(i+1);
			}
		}
		return li;
	}
}
