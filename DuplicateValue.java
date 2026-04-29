package com.arr;
import java.util.*;

public class DuplicateValue {

	public static void main(String[] args) {
		int arr[]= {67,33,22,22,33,56};
		Arrays.sort(arr);
		System.out.println("Duplicate value from arry");
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
		}

	}

}
