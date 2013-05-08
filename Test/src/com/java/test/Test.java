package com.java.test;

import java.util.Arrays;
import java.util.Date;

public class Test {
	public static void main(String args[]){
		System.out.println(Test.dealMultipleAnswer("B", false));
		System.out.println(getDateStr());
	}
	
	private static String dealMultipleAnswer(String label,boolean isSelected){
		String result = "";
		String answer ="A#B#C";
		String[] answers = null;
		
		if(isSelected){
			answers = (answer+"#"+label).split("#");
		}else{
			answer = answer.replace(label, "");
			answers = answer.split("#");
		}
		Arrays.sort(answers);
		
		int len = answers.length;
		for(int i=0;i<len;i++){
			if(!answers[i].equals("")){
				result += answers[i] + "#";
			}
		}
		
		return result.substring(0, result.lastIndexOf("#"));
	}
	
	private static String getDateStr(){
		return new Date().toString();
	}
}
