package com.twago.assignment.findmax.solutions.factory;

import com.twago.assignment.findmax.constants.SolutionType;
import com.twago.assignment.findmax.solutions.ComplexityProductOfYAndLogY;
import com.twago.assignment.findmax.solutions.ComplexityProductOfYAndMaxRange;
import com.twago.assignment.findmax.solutions.ComplexitySumOfXAndY;
import com.twago.assignment.findmax.solutions.SolutionForFindingMax;

/**
 * 
 * @author Jacob
 *
 */
public class SolutionFactory {

	private SolutionFactory() {}
	
	public static SolutionForFindingMax getSolutionForFindingMaxImplDependingOnComplexity(SolutionType solutionType) {
		SolutionForFindingMax solutionForFindMax = null;
		
		switch(solutionType) {
			case LOWEST_COMPLEXITY:
				solutionForFindMax = new ComplexityProductOfYAndLogY();
				break;
			case MEDIUM_COMPLEXITY:
				solutionForFindMax = new ComplexitySumOfXAndY();
				break;
			case HIGHEST_COMPLEXITY:
				solutionForFindMax = new ComplexityProductOfYAndMaxRange();
				break;
		}
		
		return solutionForFindMax;
	}
}
