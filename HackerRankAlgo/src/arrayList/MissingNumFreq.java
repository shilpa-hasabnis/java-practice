package arrayList;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class R {

	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		List<Integer>ret=new ArrayList<>();
		Collections.sort(arr);
		Collections.sort(brr);
		int min=0;
		int min1=arr.get(0);
		int min2=brr.get(0);
		if(min1>min2){
			min=min1;
		}else{
			min=min2;
		}
		System.out.println(min);
		int freq[]=new int[100];
		for(int i=0;i<brr.size();i++){
			int offset=min;
			int inc=brr.get(i);
			int val=inc-offset;
			freq[val]++;
		}
		for(int i:freq) {
			System.out.print(i+" ");
		}
		int freq2[]=new int[100];
		for(int i=0;i<arr.size();i++){
			int offset=min;
			int inc=arr.get(i);
			int val=inc-offset;
			freq2[val]++;
		}
		System.out.print("\n");

		for(int i:freq2) {
			System.out.print(i+" ");
		}
		System.out.print("\n");

		for(int i=0;i<100;i++){
			if(freq[i]!=freq2[i]){
				int val=min+i;
				ret.add(val);
			}
		}
		return ret;
	}

}

public class MissingNumFreq {
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
		List<Integer> result = R.missingNumbers(ar, br);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i)+" ");
		}
	}
}

