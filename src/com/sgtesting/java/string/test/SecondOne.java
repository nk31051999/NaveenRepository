package com.sgtesting.java.string.test;


public class SecondOne {

	public static void main(String[] args) {
		reverse1();
	}
	  private static void reverse1()
	  {
		  String s = new String("Bangalore and Mysore");
		  String a[]=s.split("  ");
		  for (int i=a.length-1;i>=0;i--)
		  {
			  System.out.print(a[i]+"  ");
;		  }

	}

}
