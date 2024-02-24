package Java8_Version;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("Java -v 7 "+sum);
//		
//		//java version 8 stream
//		int total = IntStream.rangeClosed(1, 10).sum();
//		System.err.println("Java -v 8 "+total);

//		List<String> list = Arrays.asList("sam","prakash","god","evil","sam","god");
//		List<String> out = new ArrayList<>();
//		for (String str : list) {
//			if(!out.contains(str)) {
//				out.add(str);
//			}
//		}
//		System.out.println("before java 8 "+out);
//		List<String> out1 = list.stream().distinct().collect(Collectors.toList());
//		System.out.println("in java 8 "+out1);

//		Stream<Integer> st = Stream.of(1,2,3,4,5,6,7,8,9);
//		st.forEach(num -> System.out.print(num+" "));

//		int[] arr = { 5, 3, 2, 1, 4, 2 };
//		System.out.println(secondSmallest(arr));

//		int[] arr1 = { 5, 3, 2, 1, 4 };
//		int[] arr2 = { 5, 6, 9, 10, 4 };
//		findCommenNumber(arr1,arr2);

//		int[] arr = { 11, 23, 14, 54, 16 };
//		StartWithOne(arr);

//		String[] word = {"prakash","god","evil","ganesh","jagadeesh","prabhu"};
//		wordMaxLength(word);

	}

	private static void stringMatching(String[] words) {
//		Arrays.stream(words).filter(s1 -> Arrays.stream(words).anyMatch(s2 -> s1.in))
	}

	private static void wordMaxLength(String[] word) {

		int len = Arrays.stream(word).mapToInt(out -> out.length()).max().orElse(0);
		System.out.println(len);
	}

	private static void StartWithOne(int[] arr) {

		List<Boolean> list = Arrays.stream(arr).mapToObj(String::valueOf).map(num -> num.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(list);
	}

	private static void findCommenNumber(int[] arr1, int[] arr2) {
		List<Integer> list = Arrays.stream(arr1).filter(n1 -> Arrays.stream(arr2).anyMatch(n2 -> n1 == n2)).boxed()
				.collect(Collectors.toList());
		System.out.println(list);
	}

	private static int secondSmallest(int[] arr) {
		int value = Arrays.stream(arr).sorted().distinct().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("No such second smallest number"));
		return value;
	}
}
