package ticTacToe.models;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TurnTest.class,
	TurnCompactTest.class,
	TurnWithAttributeTest.class,
	TurnWithConstructorTest.class,
	TurnWithBeforeTest.class, 
	TurnSharedTest.class,
	CoordinateWithExceptionTest.class,
	BoardWithExceptionTest.class, 
	CoordinateWithExpectedTest.class, 
	BoardWithExpectedTest.class,
	 })
public class AllTests {

}
