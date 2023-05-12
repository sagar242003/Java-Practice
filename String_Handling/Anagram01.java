package String_Handling;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int sum = 0;

		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch1);

		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch2);

		for (int i = 0; i < ch1.length; i++) {
			if (ch1.length == ch2.length) {
				sum++;
			}
		}
		if (sum == ch1.length) {
			System.out.println("It is Anagrams");
		} else {
			System.out.println("It is not Anagrams");
		}
	}

}
