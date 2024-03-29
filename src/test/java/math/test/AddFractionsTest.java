package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AddFractionsTest {
	@Test
	public void ZeroPlusZeroEqualsZero() throws Exception {
		Fraction sum = new Fraction(0).plus(new Fraction(0));
		assertEquals(0, sum.intValue());
	}

	@Test
	public void NonZeroPlusZero() {
		Fraction sum = new Fraction(3).plus(new Fraction(0));

		assertEquals(3, sum.intValue());

	}

	@Test
	public void ZeroPlusNonZero() {
		Fraction sum = new Fraction(0).plus(new Fraction(5));

		assertEquals(5, sum.intValue());
	}

	@Test
	public void NonZerPlusNonZero() {
		Fraction sum = new Fraction(3). plus(new Fraction(4));
		assertEquals(7, sum.intValue());
	}
}
