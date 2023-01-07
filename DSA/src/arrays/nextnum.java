package arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
	public static List<Integer> minimalOperations(List<String> words) {
	        List <Integer> li=new ArrayList<>();
	        for(String i : words) {
	        	int ret = checkStr(i);
	        	li.add(ret);
	        }
	        return li;
	    }

	private static int checkStr(String i) {
		int count=0;
        char[] wd=i.toCharArray();
        int ascs[]=new int[wd.length];
        for(int a=0;a<wd.length;a++){
            ascs[a]=(int) wd[a];
        }
        for(int j=0;j<wd.length-1;j++) {
            //98 //99 //98 //99
            if(ascs[j]==ascs[j+1]){
                ascs[j+1]+=1;
                count++;
            }
            
            
        }
        return count;		 
	}
	}
	public class nextnum {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int wordsCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<String> words = new ArrayList<>();

	        for (int i = 0; i < wordsCount; i++) {
	            String wordsItem = bufferedReader.readLine();
	            words.add(wordsItem);
	        }

	        List<Integer> result = Result.minimalOperations(words);

	        for (int i = 0; i < result.size(); i++) {
	            bufferedWriter.write(String.valueOf(result.get(i)));
	            if (i != result.size() - 1) {
	                bufferedWriter.write("\n");
	            }
	        }
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

