package ticTacToe.models;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.FixMethodOrder;
//import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.JVM)
public class TurnSharedTest {

	// Ponerlo "static" -> No recomendado, salvo un buen estudio para ahorrar tiempo de ejecucion drasticamente
	private static Turn OUTTurn;

	@BeforeClass
	public static void beforeClass(){
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
