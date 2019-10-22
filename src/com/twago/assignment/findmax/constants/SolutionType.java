package com.twago.assignment.findmax.constants;

public enum SolutionType {
	HIGHEST_COMPLEXITY("ComplexityProductOfYAndMaxRange"),
	MEDIUM_COMPLEXITY("ComplexitySumOfXAndY"),
	LOWEST_COMPLEXITY("ComplexityProductOfYAndLogY");
	
	final String className;
	
	SolutionType(String className) {
		this.className = className;
	}
}
