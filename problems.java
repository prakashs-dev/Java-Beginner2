package Java8_Version;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class problems {

	public static void main(String[] args) {

//		1. Write a Java program to calculate the average of a list of integers using streams.

//		int[] arr = {1, 3, 6, 8, 10, 18, 36};
//		double d = Arrays.stream(arr).average().orElse(0);
//		System.out.println(d);

//		2. Write a Java program to convert a list of strings to uppercase or lowercase using streams

//		List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
//		List<String> colUP = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
//		System.out.println(colUP);
//		List<String> colLC = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
//		System.out.println(colLC);

//		3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		int sumEven = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
//		System.out.println(sumEven);
//		int sumOdd = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
//		System.out.println(sumOdd);

//		4. Write a Java program to remove all duplicate elements from a list using streams.

//		List<Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
//		List<Integer> val = nums.stream().distinct().sorted().collect(Collectors.toList());
//		System.out.println(val);

//		5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.

//		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
//		List<String> color = colors.stream().filter(word -> word.startsWith("B")).collect(Collectors.toList());
//		System.out.println(color);

//		6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

//		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
//		List<String> asc = colors.stream().sorted().collect(Collectors.toList());
//		List<String> desc = colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(asc);
//		System.out.println(desc);

//		7. Write a Java program to find the maximum and minimum values in a list of integers using streams.

//		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
//		int max = nums.stream().max(Integer::compareTo).orElse(0);
//		System.out.println(max);
//		int min = nums.stream().min(Integer::compareTo).orElse(0);
//		System.out.println(min);

//		8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.

//		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
//		int secondSmall = nums.stream().sorted().distinct().skip(1).findFirst().orElse(null);
//		int secondLargest = nums.stream().distinct().sorted((a, b)-> Integer.compare(b, a)).skip(1).findFirst().orElse(null);
//		System.out.println(secondSmall+" "+secondLargest);

//		9. How do you find frequency of each element in an array or a list?

//		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
//				"Note Book", "Pencil");
//		Map<String, Long> res = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(res);

//		10.  How do you sort the given list of decimals in reverse order?

//		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//		List<Double> reverse = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(reverse);

//		11. From the given list of integers, print the numbers which are multiples of 5?

//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		List<Integer> x5 = listOfIntegers.stream().filter(num -> num%5 == 0).collect(Collectors.toList());
//		System.out.println(x5);

//		12. How do you merge two unsorted arrays into single sorted array using Java 8 streams?

//		int[] a = { 4, 2, 7, 1 };
//		int[] b = { 8, 3, 9, 5 };
//		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
//		System.out.println(Arrays.toString(c));

//       13. How do you merge two unsorted arrays into single sorted array without duplicates?

//		int[] a = { 4, 2, 5, 1 };
//		int[] b = { 8, 1, 9, 5 };
//		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
//		System.out.println(Arrays.toString(c));

//		14. Find second largest number in an integer array?

//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		int num = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(num);

//		15. Reverse each word of a string using Java 8 streams?

//		String str = "Java Concept Of The Day";
//		String[] s = str.split(" ");
//		String reverseStr = Arrays.stream(s).map(word -> new StringBuffer(word).reverse())
//				.collect(Collectors.joining(" "));
//		System.out.println(reverseStr);
		
		
//		16. How do you find sum of first 10 natural numbers?
		
//		int sumNatural = IntStream.range(1, 11).sum();
//		System.out.println(sumNatural);
		
		
//		17. Given a list of strings, find out those strings which start with a number?
		
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		List<String> myList = listOfStrings.stream().filter(word -> Character.isDigit(word.charAt(0))).collect(Collectors.toList());
		System.out.println(myList);
		
		
	}
}
