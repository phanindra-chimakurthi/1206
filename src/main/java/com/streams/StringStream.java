package com.streams;
import java.util.*;
import java.util.stream.Collectors;

public class StringStream {
	public static void main(String[] args) {
		List<String> str=Arrays.asList("socks","bats","dogs","fans","dogs");
		List<String> str1=str.stream().filter(x->x.endsWith("s")).collect(Collectors.toList());
		List<String> str2=str1.stream().map(y->y.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println(str2);
		Set<String> str3=str2.stream().sorted().collect(Collectors.toSet());
		Object[] a= str3.toArray();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
	
	}

}
