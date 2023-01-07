package base;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {


	public static List<String> funWithAnagrams(List<String> text) {
		// Write your code here
		List<String> li=new ArrayList<>();
		String[] texts=new String[text.size()];
		String[] chars=new String[text.size()];
		String[] dup=new String[text.size()];

		for(int i=0 ; i<text.size() ; i++){
			texts[i]=text.get(i); 
		}
		
		String[] clone=texts.clone();
		for(int i=0 ; i<text.size() ; i++){
			dup[i]=sorts(clone[i],chars[i]);
		}
		
		for(int i=0 ; i<text.size() ; i++){
			for(int j=i+1 ; j<text.size()-1 ; j++){
				int m= checks(dup[i],dup[j],li);
				if(m==1){
					li.add(text.get(i));
				}
			}
		}
		Collections.sort(li);   
		return li;
	}
	public static String sorts(String i,String chars){
		char[] elements=i.toCharArray();
		Arrays.sort(elements);
		chars=elements.toString();
		return chars;
	}
	public static int checks(String chars,String charss,List<String>li){
		int ret=0;
		if(chars.equals(charss)){
			li.remove(charss);
			 ret=1;
		}
		return ret;
	}

}


public class shilpasort {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int textCount = sc.nextInt();
		List<String> text = new ArrayList<>();
		for (int i = 0; i < textCount; i++) {
			String textItem = sc.nextLine();
			text.add(textItem);
		}

		List<String> result = Result.funWithAnagrams(text);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));

		}
	}}
