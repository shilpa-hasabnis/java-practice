package arrayList;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	class Result {

	    /*
	     * Complete the 'icecreamParlor' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts following parameters:
	     *  1. INTEGER m
	     *  2. INTEGER_ARRAY arr
	     */

	    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
	        List<Integer>li=new ArrayList<>();
	        int j;
	    for(int i=0;i<arr.size();i++){
	        int temp=arr.get(i);
	        int rev=m-temp;
	        for(j=i+1;j<arr.size();j++){
	            if(rev==arr.get(j)){
	                li.add(i+1);
	                li.add(j+1);
	            }
	        }
	    }
	    Collections.sort(li);
	    return li;
	    }

	}

	public class IcecreamParlorEasy {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        for (int tItr = 0; tItr < t; tItr++) {
	            int m = Integer.parseInt(bufferedReader.readLine().trim());

	            int n = Integer.parseInt(bufferedReader.readLine().trim());

	            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	            List<Integer> arr = new ArrayList<>();

	            for (int i = 0; i < n; i++) {
	                int arrItem = Integer.parseInt(arrTemp[i]);
	                arr.add(arrItem);
	            }

	            List<Integer> result = Result.icecreamParlor(m, arr);

	            for (int i = 0; i < result.size(); i++) {
	                bufferedWriter.write(String.valueOf(result.get(i)));

	                if (i != result.size() - 1) {
	                    bufferedWriter.write(" ");
	                }
	            }

	            bufferedWriter.newLine();
	        }

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

