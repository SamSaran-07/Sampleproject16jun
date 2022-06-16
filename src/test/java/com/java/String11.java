package com.java;

public class String11 {
public static void main(String[] args) {

	String s = "SARAN kumar ";
	String s1 = "SARAN kumar";
int length = s.length();
System.out.println(length);

String trim = s.trim();
System.out.println(trim);
boolean equals = s.equals(s1);
System.out.println(equals);
int compareTo = s.compareTo(s1);
System.out.println(compareTo);

String substring = s.substring(7,10);
System.out.println(substring);

int identityHashCode = System.identityHashCode(s1);
System.out.println(identityHashCode);

String s3 = new String("sam"); 
String s4 = new String("sam");
int identityHashCode2 = System.identityHashCode(s3);
System.out.println(identityHashCode2);
int identityHashCode3 = System.identityHashCode(s4);
System.out.println(identityHashCode3);



}
	
	
}
