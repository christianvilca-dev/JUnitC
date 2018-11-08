package ticTacToe.utils;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ticTacToe.utils.Coordinate;
import ticTacToe.utils.Direction;

@RunWith(Parameterized.class)
public class CoordinateParametrizedTest {

	private int OUTRow;

	private int OUTColumn;

	private Coordinate OUTCoordinate;

	private Coordinate coordinate;

	private boolean expectedInRow;

	private boolean expectedInColumn;

	private boolean expectedInMainDiagonal;

	private Direction expectedDirection;

	public CoordinateParametrizedTest(
			int OUTRow, int OUTColumn, // OUT
			Coordinate coordinate, // arguments
			boolean expectedInRow, 
			boolean expectedInColumn,
			boolean expectedInMainDiagonal, 
			Direction expectedDirection) {
		this.OUTRow = OUTRow;
		this.OUTColumn = OUTColumn;

		this.coordinate = coordinate;

		this.expectedInRow = expectedInRow;
		this.expectedInColumn = expectedInColumn;
		this.expectedInMainDiagonal = expectedInMainDiagonal;
		this.expectedDirection = expectedDirection;
	}
	
	@Before
	public void before() {
		OUTCoordinate = new Coordinate(OUTRow, OUTColumn);
	}

	@Test
	public void testInRow() {
		this.before();

		boolean resultInRow = OUTCoordinate.inRow(coordinate);

		assertEquals("For OUTCoordinate " + OUTCoordinate + " and "
				+ coordinate, expectedInRow, resultInRow);
	}

	@Test
	public void testInColumn() {
		this.before();

		boolean resultInColumn = OUTCoordinate.inColumn(coordinate);

		assertEquals("For OUTCoordinate " + OUTCoordinate + " and "
				+ coordinate, expectedInColumn, resultInColumn);
	}
	
	@Test
	public void testInMainDiagonal() {
		this.before();

		boolean resultInMainDiagonal = OUTCoordinate.inMainDiagonal();

		assertEquals("For OUTCoordinate " + OUTCoordinate, expectedInMainDiagonal, resultInMainDiagonal);
	}
	
	@Test
	public void testDirection() {
		this.before();

		Direction resultDirection = OUTCoordinate.direction(coordinate);

		assertEquals("For OUTCoordinate " + OUTCoordinate + " and "
				+ coordinate, expectedDirection, resultDirection);
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				// private int OUTRow;
				// private int OUTColumn;
				//
				// private Coordinate coordinate;
				//
				// private boolean expectedInRow;
				// private boolean expectedInColumn;
				// private boolean expectedInMainDiagonal;
				// private Direction expectedDirection;
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL },
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL },
				{ 2, 8, new Coordinate(2, 5), true, false, false,
						Direction.HORIZONTAL }, });
	}

}
