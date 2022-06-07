package com.assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberOps {
	public Set<Integer> findDuplicates(List<Integer> list) {
		Set<Integer> result = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
		return result;
	}

	public List<Integer> removeDuplicates(List<Integer> list) {
		List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		return result;
	}

	public int findMax(List<Integer> list) {
		int result = list.stream().max((a, b) -> a.compareTo(b)).get();
		return result;
	}

	public String findMinMax(int[] a) {

		int min = Arrays.stream(a).min().getAsInt();
		int max = Arrays.stream(a).max().getAsInt();
		return "min= " + min + " max= " + max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOps n = new NumberOps();
		List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34));
		System.out.println("***find duplicates***");
		Set<Integer> duplicates = n.findDuplicates(list1);
		System.out.println(duplicates);
		System.out.println("***remove duplicates***");
		List<Integer> list2 = new ArrayList(Arrays.asList(4, 5, 7, 8, 99, 100, 101, 33, 32, 4, 4));
		List<Integer> distinct = n.removeDuplicates(list2);
		System.out.println(distinct);
		System.out.println("***find maximum***");
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(3, 90, 350, 5));
		int max = n.findMax(list3);
		System.out.println("maximum= " + max);
		System.out.println("***min and max of an array");
		int[] arr = { 6, 8, 3, 5, 1, 9 };
		System.out.println(n.findMinMax(arr));

	}

}
