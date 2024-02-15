package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
//	["Mary","Emma","John"]
	public static String[] sortPeople(String[] names, int[] heights) {

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < heights.length; i++) {
			map.put(names[i], heights[i]);
		}
		System.out.println(map);
		
//		List<String> list = new ArrayList<>(map.keySet());
////		System.out.println(list);
		String res[] = new String[map.size()];
//		for (int i = 0; i < list.size(); i++) {
//			res[i] = list.get(i);
//			System.out.println(i);
//		}
		return res;
	}
}

public class Sort_Pepole_2418 {

	public static void main(String[] args) {

		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		String[] pepole = Main.sortPeople(names, heights);
		System.out.println();
		for (int i = 0; i < pepole.length; i++) {
			System.out.print(pepole[i]+" ");
		}
	}
}
