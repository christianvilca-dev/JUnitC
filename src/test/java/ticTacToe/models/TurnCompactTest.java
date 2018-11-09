package ticTacToe.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class TurnCompactTest {

	@Test
	public void testTurn() {
		Turn OUTTurn = new Turn();
		assertEquals(Color.XS, OUTTurn.take());
	}

	// En el "TurnTest.java" es peligroso tener varios metodos de cambio
	// por lo que se compacta en este unico metodo de cambio
	@Test
	public void testChange() {
		Turn OUTTurn = new Turn();
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.XS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
	}

}
