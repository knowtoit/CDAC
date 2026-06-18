package com.demo;

public class PalindromeString {
	public static String palindromeSubString(String s) {
		if(s==null || s.length()==0) {
			return " ";
		}
		
		String longest="";
		
		for(int i=0; i<s.length();i++) {
			String oddPalindrome = expandFromCenter(s,i,i);
			String evenPalindrome = expandFromCenter(s, i, i+1);
			
			if(oddPalindrome.length() > longest.length()) {
				longest = oddPalindrome;
			}
			
			if(evenPalindrome.length()>longest.length()){
				longest=evenPalindrome;
			}
		}
		
		
		
		return longest;
	}
	
	public static String expandFromCenter(String s, int left, int right) {
		while(left>=0 && right<s.length() && s.charAt(right)==s.charAt(left)) {
			left--;
			right++;
		}
		
		return s.substring(left+1, right);
	}
}
