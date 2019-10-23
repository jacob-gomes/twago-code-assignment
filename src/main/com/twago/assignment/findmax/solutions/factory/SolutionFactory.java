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
		
		switch(solutionType) {
			case LOWEST_COMPLEXITY:
				// ComplexityProductOfYAndLogY is considered lowest complexity because X can be 10^7 and Y can b 10^5
				// O(Y*logY) = 2.3* 10^5
				// wiz less then O(X + Y) = 10^7
				return ComplexityProductOfYAndLogY::computeMaxValue;
				
			case MEDIUM_COMPLEXITY:
				return ComplexitySumOfXAndY::computeMaxValue;
				
			case HIGHEST_COMPLEXITY:
				return ComplexityProductOfYAndMaxRange::computeMaxValue;
		}
				
		return null;
	}
}
