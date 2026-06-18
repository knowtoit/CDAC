package com.demo;

public class SubstringLongest {
	public static int findLongestSubstring(String s) {
		int maxlength=0;
		
		for(int i=0;i<s.length(); i++) {
			boolean[] visited = new boolean[256];
			int count=0;
			
			for(int j=0; j<s.length();j++) {
				char ch = s.charAt(j);
				
				if(visited[ch]) {
					break;
				}
				
				visited[ch]=true;
				count++;
			}
			
			if(count>maxlength) {
				maxlength=count;
			}
		}
		return maxlength;
	}
}
