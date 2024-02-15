package com.abStract;

import java.util.*;

public class Main {
	public static int[] exclusiveTime(int n, List<String> logs) {
		int[] exclusiveTimes = new int[n];
		Deque<Integer> stack = new ArrayDeque<>();
		int prevTime = 0;

		for (String log : logs) {
			String[] logInfo = log.split(":");
			int funcId = Integer.parseInt(logInfo[0]);
			String status = logInfo[1];
			int timestamp = Integer.parseInt(logInfo[2]);

			if (status.equals("start")) {
				System.out.println(stack.isEmpty());
				if (!stack.isEmpty()) {
					exclusiveTimes[stack.peek()] += timestamp - prevTime;
				}
				stack.push(funcId);
				prevTime = timestamp;
			} else {
				exclusiveTimes[stack.pop()] += timestamp - prevTime + 1;
				prevTime = timestamp + 1;
			}
		}
		return exclusiveTimes;
	}

	public static void main(String[] args) {
		int n = 3;
		List<String> logs = new ArrayList<>();
		logs.add("0:start:0");
		logs.add("1:start:2");
		logs.add("1:end:5");
		logs.add("0:end:6");

		int[] result = exclusiveTime(n, logs);
		System.out.println("Exclusive times of each function:");
		for (int i = 0; i < n; i++) {
			System.out.println("Function " + i + ": " + result[i]);
		}
	}
}