package ticTacToe.models;

import static org.junit.Assert.*;

import org.junit.Test;

// Para no repetir declaraciones
public class TurnWithAttributeTest {

	private Turn OUTTurn;
	
	// Metodo auxiliar que no es un metodo de prueba
	private void arrange(){
		OUTTurn = new Turn();
	}
	
	@Test
	public void testTurn() {
		this.arrange();
		assertEquals(Color.XS, OUTTurn.take());
	}

	@Test
	public void testChange() {
		this.arrange();
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.XS, OUTTurn.take());
		OUTTurn.change();
		assertEquals(Color.OS, OUTTurn.take());
	}

}
