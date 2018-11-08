package ticTacToe.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import ticTacToe.utils.Coordinate;
import ticTacToe.utils.Direction;

public class CoordinateAAATest {

	private Coordinate OUTCoordinate;
	
	private Coordinate coordinate;
	
	@Test
	public void testInRow() {
		boolean resultInRow;
		boolean expectedInRow;
		
		// arrange
		OUTCoordinate = new Coordinate(1,1);
		coordinate = new Coordinate(2,3);
		// act
		resultInRow = OUTCoordinate.inRow(coordinate);
		// assertions
		expectedInRow = false;
		assertEquals(expectedInRow, resultInRow);
		
		// arrange
		OUTCoordinate = new Coordinate(1,2);
		coordinate = new Coordinate(1,1);
		// act
		resultInRow = OUTCoordinate.inRow(coordinate);
		// assertions
		expectedInRow = true;
		assertEquals(expectedInRow, resultInRow);
	}
	
	@Test
	public void testInColumn() {
		boolean resultInColumn;
		boolean expectedInColumn;
		
		// arrange
		OUTCoordinate = new Coordinate(1,1);
		coordinate = new Coordinate(2,3);
		// act
		resultInColumn = OUTCoordinate.inColumn(coordinate);
		// assertions
		expectedInColumn = false;
		assertEquals(expectedInColumn, resultInColumn);
		
		// arrange
		OUTCoordinate = new Coordinate(1,2);
		coordinate = new Coordinate(1,1);
		// act
		resultInColumn = OUTCoordinate.inColumn(coordinate);
		// assertions
		expectedInColumn = false;
		assertEquals(expectedInColumn, resultInColumn);
	}
	
	@Test
	public void testInMainDiagonal() {
		boolean resultInMainDiagonal;
		boolean expectedInMainDiagonal;
		
		// arrange
		OUTCoordinate = new Coordinate(1,1);
		// act
		resultInMainDiagonal = OUTCoordinate.inMainDiagonal();
		// assertions
		expectedInMainDiagonal = true;
		assertEquals(expectedInMainDiagonal, resultInMainDiagonal);
		
		// arrange
		OUTCoordinate = new Coordinate(1,2);
		// act
		resultInMainDiagonal = OUTCoordinate.inMainDiagonal();
		// assertions
		expectedInMainDiagonal = false;
		assertEquals(expectedInMainDiagonal, resultInMainDiagonal);
	}
	
	@Test
	public void testDirection() {	
		Direction resultDirection;
		Direction expectedDirection;
		
		// arrange
		OUTCoordinate = new Coordinate(1,1);
		coordinate = new Coordinate(2,3);
		// act
		resultDirection = OUTCoordinate.direction(coordinate);
		// assertions
		expectedDirection = Direction.NON_EXISTENT;
		assertEquals(expectedDirection, resultDirection);
		
		// arrange
		OUTCoordinate = new Coordinate(1,2);
		coordinate = new Coordinate(1,1);
		// act
		resultDirection = OUTCoordinate.direction(coordinate);
		// assertions
		expectedDirection = Direction.HORIZONTAL;
		assertEquals(expectedDirection, resultDirection);
	}

}
