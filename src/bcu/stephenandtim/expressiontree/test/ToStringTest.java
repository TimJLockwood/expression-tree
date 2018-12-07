package bcu.stephenandtim.expressiontree.test;

import bcu.stephenandtim.expressiontree.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class ToStringTest {

	@Test
	public void additionToStringTest() {
		BinaryOperation expression = new Addition(new Constant(1), new Constant(1));
		assertEquals("(1.0 + 1.0)", expression.toString());
	}

	@Test
	public void subtractionToStringTest() {
		BinaryOperation expression = new Subtraction(new Constant(1), new Constant(1));
		assertEquals("(1.0 - 1.0)", expression.toString());
	}

	@Test
	public void multiplicationToStringTest() {
		BinaryOperation expression = new Multiplication(new Constant(1), new Constant(1));
		assertEquals("(1.0 * 1.0)", expression.toString());
	}

	@Test
	public void divisionToStringTest() {
		BinaryOperation expression = new Division(new Constant(1), new Constant(1));
		assertEquals("(1.0 / 1.0)", expression.toString());
	}

	@Test
	public void sqrtToStringTest() {
		SquareRoot expression = new SquareRoot(new Constant(1));
		assertEquals("sqrt(1.0)", expression.toString());
	}
	@Test
	public void constantToStringTest() {
		Constant constant = new Constant(1);
		assertEquals("1.0", constant.toString());
	}

	@Test
	public void variableToStringTest() {
		Variable variable = new Variable("x");
		assertEquals("x", variable.toString());
	}

}
