package ticTacToe.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	CoordinateAAATest.class,
	ClosedIntervalAAATest.class, 
	CoordinateCompactTest.class, 
	ClosedIntervalCompactTest.class,
	CoordinateReusabilityTest.class,
	ClosedIntervalReusabilityTest.class,
	CoordinateWithoutParametrizedTest.class,
	ClosedIntervalWithoutParametrizedTest.class, 
	CoordinateParametrizedTest.class,
	CoordinateParametrizedTest.class })
public class AllTests {

}