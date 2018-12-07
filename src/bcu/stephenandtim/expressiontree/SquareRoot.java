package bcu.stephenandtim.expressiontree;

import java.util.Map;
import java.util.Set;

public class SquareRoot extends Expression {

	Expression subExpression;

	public SquareRoot(Expression subExpression) {
		this.subExpression = subExpression;
	}

	@Override
	public double evaluate(Map<String, Double> variables) {
		return Math.sqrt(subExpression.evaluate(variables));
	}

	@Override
	public Set<String> freeVariables() {
		return subExpression.freeVariables();
	}

	@Override
	public String toString() {
		return "sqrt(" + subExpression.toString() + ")";
	}
}
