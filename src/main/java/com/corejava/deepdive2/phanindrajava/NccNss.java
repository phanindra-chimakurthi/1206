package com.corejava.deepdive2.phanindrajava;
import java.util.*;

public class NccNss {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter the no of ncc candidates:");
		int n=read.nextInt();
		System.out.println("enter the no of nss candidates:");
		int m=read.nextInt();
		int[] ncc=new int[n];
		int[] nss=new int[m];
		System.out.println("enter the ids of ncc candidates:");
		for(int i=0;i<n;i++) {
			ncc[i]=read.nextInt();
		}
		System.out.println("enter the ids of nss candidates: ");
		for(int i=0;i<m;i++) {
			nss[i]=read.nextInt();
		}
		String str=Arrays.toString(ncc);
		String str1=Arrays.toString(nss);
		for(int i=0;i<n;i++) {
			if(str.contains(str1)) {
				System.out.println(str);
			}
		}
	}

}
