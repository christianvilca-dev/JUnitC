package ticTacToe.utils;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ticTacToe.utils.ClosedInterval;

@RunWith(Parameterized.class)
public class ClosedIntervalParametrizedTest {

	private int OUTMin;

	private int OUTMax;

	private ClosedInterval OUTClosedInterval;

	private int value;
	
	private ClosedInterval closedInterval;

	private int expectedLength;

	private ClosedInterval expectedShiftedClosedInterval;

	private boolean expectedIncludedValue;

	private boolean expectedIncludedClosedInterval;

	private boolean expectedIntersected;

	private ClosedInterval expectedIntersection;

	private ClosedInterval expectedUnion;

	public ClosedIntervalParametrizedTest(
			int OUTMin, int OUTMax, // OUT
			int value, ClosedInterval closedInterval, // arguments
			int expectedLength, 
			ClosedInterval expectedShiftedClosedInterval,
			boolean expectedIncludedValue,
			boolean expectedIncludedClosedInterval,
			boolean expectedIntersected, 
			ClosedInterval expectedIntersection,
			ClosedInterval expectedUnion) {
		this.OUTMin = OUTMin;
		this.OUTMax = OUTMax;
		
		this.expectedLength = expectedLength;
		this.value = value;
		
		this.expectedShiftedClosedInterval = expectedShiftedClosedInterval;
		this.expectedIncludedValue = expectedIncludedValue;
		this.closedInterval = closedInterval;
		this.expectedIncludedClosedInterval = expectedIncludedClosedInterval;
		this.expectedIntersected = expectedIntersected;
		this.expectedIntersection = expectedIntersection;
		this.expectedUnion = expectedUnion;
	}

	@Before
	public void before() {
		OUTClosedInterval = new ClosedInterval(OUTMin, OUTMax);
	}

	@Test
	public void testLength() {
		int resultLength = OUTClosedInterval.length();
		assertEquals(expectedLength, resultLength);
	}

	@Test
	public void testShift() {
		OUTClosedInterval.shift(value);
		assertEquals(expectedShiftedClosedInterval, OUTClosedInterval);
	}

	@Test
	public void testIncludesValue() {
		boolean resultIncludedValue = OUTClosedInterval.includes(value);
		assertEquals(expectedIncludedValue, resultIncludedValue);
	}

	@Test
	public void testIncludesClosedInterval() {
		boolean resultIncludedClosedInterval = OUTClosedInterval.includes(closedInterval);
		assertEquals(expectedIncludedClosedInterval, resultIncludedClosedInterval);
	}

	@Test
	public void testIntersected() {
		boolean resultIntersected = OUTClosedInterval.intersected(closedInterval);
		assertEquals(expectedIntersected, resultIntersected);
	}

	@Test
	public void testIntersection() {
		ClosedInterval resultIntersection = OUTClosedInterval.intersection(closedInterval);
		assertEquals(expectedIntersection, resultIntersection);
	}

	@Test
	public void testUnion() {
		ClosedInterval resultUnion = OUTClosedInterval.union(closedInterval);
		assertEquals(expectedUnion, resultUnion);
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays
				.asList(new Object[][] {
						// private int SUTMin;
						// private int SUTMax;
						//
						// private int value;
						// private ClosedInterval closedInterval;
						//
						// private int expectedLength;
						// private ClosedInterval expectedShiftedClosedInterval;
						// private boolean expectedIncludedValue;
						// private boolean expectedIncludedClosedInterval;
						// private boolean expectedIntersected;
						// private ClosedInterval expectedIntersection;
						// private ClosedInterval expectedUnion;
						{ 12, 34, 16, new ClosedInterval(16, 30), 22,
								new ClosedInterval(28, 50), true, true, true,
								new ClosedInterval(16, 30),
								new ClosedInterval(12, 34) },
						{ -8, -4, 6, new ClosedInterval(-7, -5), 4,
								new ClosedInterval(-2, 2), false, true, true,
								new ClosedInterval(-7, -5),
								new ClosedInterval(-8, -4) },
						{ -8, 4, -2, new ClosedInterval(-7, -5), 12,
								new ClosedInterval(-10, 2), true, true, true,
								new ClosedInterval(-7, -5),
								new ClosedInterval(-8, 4) },
						{ -8, 4, 10, new ClosedInterval(-7, -5), 12,
								new ClosedInterval(2, 14), false, true, true,
								new ClosedInterval(-7, -5),
								new ClosedInterval(-8, 4) },
						{ -8, 4, 6, new ClosedInterval(2, 9), 12,
								new ClosedInterval(-2, 10), false, false, true,
								new ClosedInterval(2, 4),
								new ClosedInterval(-8, 9) }, });
	}

}