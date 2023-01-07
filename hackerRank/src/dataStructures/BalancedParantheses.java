package dataStructures;
import java.util.*;
public class BalancedParantheses {

	static char[][] brace= {{'(',')'},{'[',']'},{'{','}'}};

	private static boolean balanced(char[] str) {
		Stack<Character> st= new Stack<Character>();
		for(char c:str) {
			if(open(c)) {
				st.push(c);
			}
			else {
				if(st.isEmpty()||!matches(st.pop(),c)) {
					return false;
				}
			}
		}
		return st.isEmpty();
	}
	private static boolean matches(Character pop, char c) {
		for(char k[]: brace) {
			if(open(pop))
			{
					return k[1]==c;
			}
		}
		return false;
	}
	private static boolean open(char c) {
		for(char[] j:brace){
			if(j[0] == c) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String buff= sc.nextLine();
		char[] str=buff.toCharArray();
		boolean test=balanced(str);
		if(test) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}
}