package com.JavaEight;

import java.util.Arrays;
import java.util.List;

public class CountList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=Arrays.asList("chand","ana","pray","aan","pras","anth");
		long n=li.stream().count();
		System.out.println(n);

	}

}
