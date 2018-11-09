package ticTacToe.models;

import static org.junit.Assert.*;

import org.junit.Test;

// Cuerpo - Constructor - para no repetir declaraciones
public class TurnWithConstructorTest {

	private Turn OUTTurn;
	
	public TurnWithConstructorTest(){
		OUTTurn = new Turn();
	}
	
	@Test
	public void testTurn() {
		assertEquals(Color.XS, OUTTurn.take());
	}

	@Test
	public void testChange() {
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.XS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
	}

}
