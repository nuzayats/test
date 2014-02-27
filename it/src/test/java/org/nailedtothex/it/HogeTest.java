package org.nailedtothex.it;

import static org.junit.Assert.*;

import org.junit.Test;

public class HogeTest {

	@Test
	public void test() {
		System.out.println("***THIS IS A UNIT TEST***");
		assertEquals(3, new Hoge().add(1, 2));
	}

}
