package auxiliar.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// Reusabilidad - @Before, @After, @BeforeClass y @AfterClass - Traza
public class ExecutionReusabilityTest {
	
	private static int staticMember = 0;
	static {
		staticMember++;
		System.out.println("static code: " + staticMember);
	}
	
	private int instanceMember;
	
	public ExecutionReusabilityTest(){
		staticMember++;
		instanceMember++;
		System.out.println("constructor: " + staticMember + " and " +  instanceMember);
	}
	
	@BeforeClass
	public static void beforeAll(){
		staticMember++;
		System.out.println("before class: " + staticMember);
	}
	
	@Before
	public void before(){
		staticMember++;
		instanceMember++;
		System.out.println("before: " + staticMember + " and " +  instanceMember);
	}
	
	@Test
	public void test1(){
		staticMember++;
		instanceMember++;
		System.out.println("test 1: " + staticMember + " and " +  instanceMember);
	}
	
	@Test
	public void test2(){
		staticMember++;
		instanceMember++;
		System.out.println("test 2: " + staticMember + " and " +  instanceMember);
	}
	
	@Test
	public void test3(){
		staticMember++;
		instanceMember++;
		System.out.println("test 3: " + staticMember + " and " +  instanceMember);
	}
	
	@After
	public void after(){
		staticMember++;
		instanceMember++;
		System.out.println("after: " + staticMember + " and " +  instanceMember);
	}
	
	@AfterClass
	public static void afterClass(){
		staticMember++;
		System.out.println("after class: " + staticMember);
	}
	
	
//	static code: 1
//	before class: 2
//	constructor: 3 and 1
//	before: 4 and 2
//	test 1: 5 and 3
//	after: 6 and 4
//	constructor: 7 and 1 -> "1" porque hay nueva instancia de la clase pruebas
//	before: 8 and 2
//	test 2: 9 and 3
//	after: 10 and 4
//	constructor: 11 and 1
//	before: 12 and 2
//	test 3: 13 and 3
//	after: 14 and 4
//	after class: 15
}
