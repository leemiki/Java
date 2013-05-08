package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class EnumExample {
	
	public static void main(String args[]){
		TestList();
	}
	
	public static void TestList(){
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		List<String> childList = new ArrayList<String>();
		childList.add("ccc");
		list.addAll(childList);
		for(String str:list){
			System.out.println(str);
		}
	}
}
