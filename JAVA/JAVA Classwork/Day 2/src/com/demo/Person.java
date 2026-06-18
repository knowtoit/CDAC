package com.demo;

public class Person {
	static int count;
	static {
		count = 0;
	}
	private String pid;
	private String pname;
	private String mob; // took string as we are not gonna use mobile number in any calculations anyhow. 
//	Also we can write it as '+91-' also. So its better we take string for mobile number
	private String generatePid(String nm, String m) {
		count++;
		return nm.substring(0, 3) + m.substring(0,3) + count;
	}
	
	public Person() {
		pid = generatePid("xxxx", "444444");
		pname = null;
		mob = null;
	}
	
	public Person(String nm, String m) {
		pid = generatePid("xxx", "4444");
		pname = nm;
		mob = m;
	}
	
	public void setPname(String nm) {
		pname = nm;
	}
	
	public void setmob(String m) {
		mob = m;
	}
	
	public String getPid() {
		return pid;
	}
	
	public String getPnmae() {
		return pname;
	}
	
	public String getMob() {
		return mob;
	}
	
	public String toString() {
		return pid + "," + pname + " , " + mob;
	}
}
