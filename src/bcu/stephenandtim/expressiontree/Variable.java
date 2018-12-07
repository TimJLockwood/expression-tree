package bcu.stephenandtim.expressiontree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Variable extends Expression {

	String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public double evaluate(Map<String, Double> variables) {
		if (variables.containsKey(name)) {
			return variables.get(name);
		} else {
			throw new IllegalArgumentException("Value not found: " + name + " in " + variables);
		}
	}

	@Override
	public Set<String> freeVariables() {
		Set set = new HashSet();
		set.add(name);
		return Collections.unmodifiableSet(set);
	}

	@Override
	public String toString() {
		return name;
	}

}
