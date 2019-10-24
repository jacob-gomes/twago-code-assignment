package com.twago.assignment.findmax.solutions.factory;

import com.twago.assignment.findmax.constants.SolutionType;
import com.twago.assignment.findmax.solutions.SolutionComplexityProductOfYAndLogY;
import com.twago.assignment.findmax.solutions.SolutionComplexityProductOfYAndMaxRange;
import com.twago.assignment.findmax.solutions.SolutionComplexitySumOfXAndY;
import com.twago.assignment.findmax.solutions.SolutionForFindingMax;

/**
 * 
 * @author Jacob
 *
 */
public class SolutionFactory {
	
	public static SolutionForFindingMax getSolutionForFindingMaxImplDependingOnComplexity(SolutionType solutionType) {
		
		switch(solutionType) {
			case LOWEST_COMPLEXITY:
				// ComplexityProductOfYAndLogY is considered lowest complexity because X can be 10^7 and Y can b 10^5
				// O(Y*logY) = 2.3* 10^5
				// wiz less then O(X + Y) = 10^7
				return SolutionComplexityProductOfYAndLogY::computeMaxValue;
				
			case MEDIUM_COMPLEXITY:
				return SolutionComplexitySumOfXAndY::computeMaxValue;
				
			case HIGHEST_COMPLEXITY:
				return SolutionComplexityProductOfYAndMaxRange::computeMaxValue;
		}
				
		return null;
	}
}
