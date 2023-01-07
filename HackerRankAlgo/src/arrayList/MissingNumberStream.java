package arrayList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;  
class Rult {
	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		List<Integer>ret= new ArrayList<>();
		Collections.sort(arr);
		Collections.sort(brr);
		brr.stream().forEach(System.out::print);
		System.out.println(" ");
		arr.stream().forEach(System.out::print);
		System.out.println("\n");
		int j=0;
		System.out.print("i"+" ");
		System.out.print("j");
		System.out.println("\n");
		for(int i=0;i<brr.size();i++) {
			int in1=arr.get(i);
			int in2=brr.get(j);
			System.out.print(in1+" ");
			System.out.print(in2);
			System.out.println("\n");
			if(in1 == in2) {
				arr.remove(arr.indexOf(in1));
				brr.remove(brr.indexOf(in2));
				j++;
			}else {
				ret.add(in2);
				brr.remove(brr.indexOf(in2));
			}
		}
		return ret;
	}
}

public class MissingNumberStream {
	public static void main(String[] args) throws IOException {
		int[] arr= {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
		List<Integer> ar=new ArrayList<>();
		List <Integer> br= new ArrayList<>();
		int brr[]= {203, 204, 204, 205, 206, 207 ,205 ,208 ,203 ,206, 205, 206, 204};
		for(int i=0;i<arr.length;i++) {
			ar.add(arr[i]);
		}
		for(int i=0;i<brr.length;i++) {
			br.add(brr[i]);
		}
		List<Integer> result = Rult.missingNumbers(ar, br);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i)+" ");
		}
	}
}
