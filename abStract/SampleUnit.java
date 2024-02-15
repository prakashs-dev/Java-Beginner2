package com.abStract;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleUnit {

	@Test
	void test() {
		Sample s = new Sample();
		assertEquals(s.caseConvert("PrAkASh"), "prakash");
		System.out.println("Done");
	}

}
