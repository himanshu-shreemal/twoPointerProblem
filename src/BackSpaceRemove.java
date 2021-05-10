package towPointer;

import java.util.Stack;

public class BackSpaceRemove {

	public static void main(String[] args) {

		String s1 = "##ABCD##";
		String s2 = "ABCD##";

		System.out.println(removeBackSpace(s1, s2));
	}

	public static boolean removeBackSpace(String s1, String s2) {

		Stack<Character> st1 = new Stack();
		Stack<Character> st2 = new Stack();
		int i = 0;
		while (i < s1.length()) {
			if (s1.charAt(i) != '#') {
				st1.push(s1.charAt(i));
			} else {
				if (!st1.isEmpty()) {
					st1.pop();
				}
			}
			++i;
		}
		i = 0;
		while (i < s2.length()) {
			if (s2.charAt(i) != '#') {
				st2.push(s2.charAt(i));
			} else {
				if (!st2.isEmpty()) {
					st2.pop();
				}
			}
			++i;
		}
		if (st1.size() == st2.size()) {
			while (!st1.isEmpty()) {
				if (st1.pop() != st2.pop())
					return false;
			}
			return true;
		}
		return false;
	}

}
