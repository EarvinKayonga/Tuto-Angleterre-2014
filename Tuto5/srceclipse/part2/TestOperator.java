package part2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestOperator {

	private Operation op1, op2;
	
	public TestOperator() {
		op1 = new Operation(2.3f, '*', -4.6f);
		op2 = null;
	}
	
	@Test
	public void testEval() throws BadOperatorException {
		assertNotNull(op1);
		assertEquals(-10.58f, op1.eval(), 0);
		assertNull(op2);
		op2 = new Operation(6.9f, '-', -1.1f);
		assertNotNull(op2);
		assertEquals(8.0f, op2.eval(), 0);
		assertNotSame(op1, op2);
	}

}
