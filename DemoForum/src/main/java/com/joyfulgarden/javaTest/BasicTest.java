package com.joyfulgarden.javaTest;

public class BasicTest {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		System.out.println("str1==str2是" + (str1==str2) + "的");
		System.out.println("str1.equals(str1)是" + str1.equals(str1) + "的");
		

		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("str1==str3是" + (str1==str3) + "的");
		System.out.println("str1.equals(str3)是" + str1.equals(str3) + "的");
		
		System.out.println("str3==str4是" + (str3==str4) + "的");
		System.out.println("str3.equals(str4)是" + str3.equals(str4) + "的");
		
		System.out.println();
		
		int a = 10;
		int b = 10;
		//int c = new Integer(10);古老用法，已可簡化成下列
		int c = new Integer(10);
		int d = new Integer(10);
		Integer e = 10;
		Integer f = 10;
		Integer ee = 10000;
		Integer ff = 10000;
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println(ee == ff); // 在Java中對於範圍在 -128 到 127 之間的整數，會使用緩存（cache）來重複使用相同的物件。這被稱為 "Integer Cache"。
		//System.out.println(a.equals(b);  equals()方法是用於比較物件的內容，而基本資料型別是沒有內容的，它們僅僅是一個數值。
		//System.out.println(c.equals(d));
		System.out.println(e.equals(f));
		
		
		
	}

}
