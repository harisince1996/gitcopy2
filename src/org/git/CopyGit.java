package org.git;

public class CopyGit {
public static void main(String[] args) {	


	System.out.println("copy git");
	String s= "phython";
	String r="";
for (int i = s.length()-1; i >=0 ; i--) {
	char ch = s.charAt(i);
	r=r+ch;
	}
System.out.println("after rev:"+r);

}
}
