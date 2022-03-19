package com.sgtesting.java.string.test;

class StringFirst
{
	static void getpattern()
	{
		String s= "welcome";
		for (int i=s.length();i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(s.charAt(j)+"    ");
			}
			System.out.println();
			}
		}
	}



public class FirstOne {

	public static void main(String[] args) {
		StringFirst.getpattern();



	}

}
