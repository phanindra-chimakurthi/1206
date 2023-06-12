package com.streams;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class StreamEx {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,5,6,8,44);
		System.out.println(l.stream().map(x->x*x).collect(Collectors.toList()));
		//create a list of string
		List<String> str=Arrays.asList("ram","bheem","syam");
		List<String> res=str.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
		System.out.println(res);
		List<String> res1=str.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(res1);
		List<String> show=str.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		List<Integer> num=Arrays.asList(2,5,7,8);
		//return set collection
		Set<Integer> squareSet=num.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squareSet);
		//foreach method
		num.stream().map(x->x*x).forEach(y->System.out.println(y));
		//reduce method
		int even=num.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(even);
		
				
		
	}

}
