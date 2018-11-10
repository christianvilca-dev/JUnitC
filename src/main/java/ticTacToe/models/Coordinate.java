package ticTacToe.models;

import java.util.Random;

import ticTacToe.utils.ClosedInterval;
import ticTacToe.utils.Direction;

public class Coordinate {
	
	private ticTacToe.utils.Coordinate coordinate;

	public static final int DIMENSION = 3;
	
	private static final ClosedInterval LIMITS = new ClosedInterval(0, Coordinate.DIMENSION-1);

	// NO HAY EXCEPCION
	// Porque el constructor de "Coordinate" no levanta nada
	public Coordinate(){
		coordinate = new ticTacToe.utils.Coordinate();
	}
	
	// SI HAY EXCEPCION
	// Porque llama a setRow y setColumn que tienen un assert que si no se cumplen va ha levantar una asercion
	// llamada assertionError
	public Coordinate(int row, int column){
		this();
		this.setRow(row);
		this.setColumn(column);
	}
	
	// NO HAY EXCEPCION
	// Porque me dan un objeto de la clase "Coordinate", 
	// puede que al que lo construyo halla excepcion sino cumple las restricciones
	// pero cuanda me lanza a mi el mensaje el objeto ya no hay excepcion
	public Coordinate(Coordinate coordinate) {
		this(coordinate.coordinate.getRow(),
				coordinate.coordinate.getColumn());
	}

	public void setRow(int row){
		assert LIMITS.includes(row);
		coordinate.setRow(row);
	}
	
	public void setColumn(int column){
		assert LIMITS.includes(column);
		coordinate.setColumn(column);
	}
	
	// NO HAY EXCEPCION
	// Porque soy yo quien genera los numeros aleatorios entre 0 y 2
	public void random() {
		Random random = new Random(System.currentTimeMillis());
		this.setRow(random.nextInt(Coordinate.DIMENSION));
		this.setColumn(random.nextInt(Coordinate.DIMENSION));
	}
	
	// NO HAY EXCEPCION
	// Porque son consultas
	public Direction direction(Coordinate coordinate){
		Direction direction = this.coordinate.direction(coordinate.coordinate);
		if (direction == Direction.NON_EXISTENT) {
			if(this.inInverse() && coordinate.inInverse())
				return Direction.INVERSE_DIAGONAL;
		}
		return direction;
	}
	
	// NO HAY EXCEPCION
	private boolean inInverse(){
		return coordinate.getRow() + coordinate.getColumn() == Coordinate.DIMENSION-1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((coordinate == null) ? 0 : coordinate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (coordinate == null) {
			if (other.coordinate != null)
				return false;
		} else if (!coordinate.equals(other.coordinate))
			return false;
		return true;
	}
	
	@Override
	public Coordinate clone() {
		return new Coordinate(this);
	}
	
	public int getRow() {
		return coordinate.getRow();
	}
	
	public int getColumn() {
		return coordinate.getColumn();
	}
	
}
