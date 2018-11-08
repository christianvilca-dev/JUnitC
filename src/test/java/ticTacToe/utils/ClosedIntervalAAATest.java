package ticTacToe.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ticTacToe.utils.ClosedInterval;

public class ClosedIntervalAAATest {

	private ClosedInterval OUTClosedInterval;

	private int value;

	private ClosedInterval closedInterval;

	@Test
	public void testLength() {
		int resultLength;
		int expectedLength;

		// arrange
		OUTClosedInterval = new ClosedInterval(12, 34);
		// act
		resultLength = OUTClosedInterval.length();
		// assertions
		expectedLength = 22;
		assertEquals(expectedLength, resultLength);

		// arrange
		OUTClosedInterval = new ClosedInterval(-8, -4);
		// act
		resultLength = OUTClosedInterval.length();
		// assertions
		expectedLength = 4;
		assertEquals(expectedLength, resultLength);
	}

	@Test
	public void testShift() {
		ClosedInterval expectedShift;

		// arrange
		OUTClosedInterval = new ClosedInterval(12, 34);
		value = 16;
		// act
		OUTClosedInterval.shift(value);
		// assertions
		expectedShift = new ClosedInterval(28, 50);
		assertEquals(expectedShift, OUTClosedInterval);

		// arrange
		OUTClosedInterval = new ClosedInterval(-8, -4);
		value = 6;
		// act
		OUTClosedInterval.shift(value);
		// assertions
		expectedShift = new ClosedInterval(-2, 2);
		assertEquals(expectedShift, OUTClosedInterval);
	}

	@Test
	public void testIncludesValue() {
		boolean resultIncludedValue;
		boolean expectedIncludedValue;

		// arrange
		OUTClosedInterval = new ClosedInterval(12, 34);
		value = 16;
		// act
		resultIncludedValue = OUTClosedInterval.includes(value);
		// assertions
		expectedIncludedValue = true;
		assertEquals(expectedIncludedValue, resultIncludedValue);

		// arrange
		OUTClosedInterval = new ClosedInterval(-8, -4);
		value = 4;
		// act
		resultIncludedValue = OUTClosedInterval.includes(value);
		// assertions
		expectedIncludedValue = false;
		assertEquals(expectedIncludedValue, resultIncludedValue);
	}

	@Test
	public void testIncludesClosedInterval() {
		boolean resultIncludedClosedInterval;
		boolean expectedIncludedClosedInterval;

		// arrange
		OUTClosedInterval = new ClosedInterval(12, 34);
		closedInterval = new ClosedInterval(16, 30);
		// act
		resultIncludedClosedInterval = OUTClosedInterval.includes(closedInterval);
		// assertions
		expectedIncludedClosedInterval = true;
		assertEquals(expectedIncludedClosedInterval,
				resultIncludedClosedInterval);

		// arrange
		OUTClosedInterval = new ClosedInterval(-8, -4);
		closedInterval = new ClosedInterval(-7, -5);
		// act
		resultIncludedClosedInterval = OUTClosedInterval.includes(closedInterval);
		// assertions
		expectedIncludedClosedInterval = true;
		assertEquals(expectedIncludedClosedInterval,
				resultIncludedClosedInterval);
	}

	@Test
	public void testIntersected() {
		boolean resultIntersected;
		boolean expectedIntersected;

		// arrange
		OUTClosedInterval = new ClosedInterval(12, 34);
		closedInterval = new ClosedInterval(16, 30);
		// act
		resultIntersected = OUTClosedInterval.intersected(closedInterval);
		// assertions
		expectedIntersected = true;
		assertEquals(expectedIntersected, resultIntersected);

		// arrange
		OUTClosedInterval = new ClosedInterval(-8, -4);
		closedInterval = new ClosedInterval(-7, -5);
		// act
		resultIntersected = OUTClosedInterval.intersected(closedInterval);
		// assertions
		expectedIntersected = true;
		assertEquals(expectedIntersected, resultIntersected);
	}
	
	@Test
	public void testIntersection() {
		ClosedInterval resultIntersection;
		ClosedInterval expectedIntersection;

		// arrange
		OUTClosedInterval = new ClosedInterval(12, 34);
		closedInterval = new ClosedInterval(16, 30);
		// act
		resultIntersection = OUTClosedInterval.intersection(closedInterval);
		// assertions
		expectedIntersection = new ClosedInterval(16, 30);
		assertEquals(expectedIntersection, resultIntersection);

		// arrange
		OUTClosedInterval = new ClosedInterval(-8, -4);
		closedInterval = new ClosedInterval(-7, -5);
		// act
		resultIntersection = OUTClosedInterval.intersection(closedInterval);
		// assertions
		expectedIntersection = new ClosedInterval(-7, -5);
		assertEquals(expectedIntersection, resultIntersection);
	}
	
	@Test
	public void testUnion() {
		ClosedInterval resultUnion;
		ClosedInterval expectedUnion;

		// arrange
		OUTClosedInterval = new ClosedInterval(12, 34);
		closedInterval = new ClosedInterval(16, 30);
		// act
		resultUnion = OUTClosedInterval.union(closedInterval);
		// assertions
		expectedUnion = new ClosedInterval(12, 34);
		assertEquals(expectedUnion, resultUnion);

		// arrange
		OUTClosedInterval = new ClosedInterval(-8, -4);
		closedInterval = new ClosedInterval(-7, -5);
		// act
		resultUnion = OUTClosedInterval.union(closedInterval);
		// assertions
		expectedUnion = new ClosedInterval(-8, -4);
		assertEquals(expectedUnion, resultUnion);
	}
	
}
