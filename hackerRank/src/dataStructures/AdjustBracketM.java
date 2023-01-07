package dataStructures;

import java.util.Stack;

class AdjustBracketM {
	public int solution(String S) {
		if (S.length() % 2 != 0) {
			return 0;
		}
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(' || S.charAt(i) == '[' || S.charAt(i) == '{') {
				stack.push(S.charAt(i));
			} else {
				if (stack.size() == 0) {
					return 0;
				}
				Character last = stack.pop();
				if (!isValidPair(last, S.charAt(i))) return 0;
			}

		}
		if (stack.size() != 0) {
			return 0;
		}
		return 1;
	}
	public boolean isValidPair(Character left, Character right) {
		if (left.equals('(') && right.equals(')')) {
			return true;
		}
		if (left.equals('[') && right.equals(']')) {
			return true;
		}
		if (left.equals('{') && right.equals('}')) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) throws Exception {

		AdjustBracketM bracketsSolution = new AdjustBracketM();
		System.out.println(bracketsSolution.solution("((({}){}))"));

	}
}