package com.twago.assignment.findmax.solutions;

import java.util.Map;
import java.util.TreeMap;

import com.twago.assignment.findmax.model.InputModel;
/**
 * This solution has the medium complexity
 * Computes in a linear complexity of 
 * O(n) = O(Y*(log Y))
 * @author Jacob
 *
 */
public class ComplexityProductOfYAndLogY {
	
	private ComplexityProductOfYAndLogY() {}
	
	public static int computeMaxValue(InputModel inputModel) {
		
		int maxValue;
		int sumOfUntilPreviousIteration;
		int lowerLimit;
		int upperLimit;
		int valueToBeAdded;
		Map<Integer,Integer> prefixTreeMap = new TreeMap<>();
		
		for(InputModel.IJKCombination ijkCombination : inputModel.getIjkCombinationList()) {
			lowerLimit = ijkCombination.i;
			upperLimit = ijkCombination.j;
			valueToBeAdded = ijkCombination.k;
			
			prefixTreeMap.put(lowerLimit, getNotNullValue(prefixTreeMap.get(lowerLimit)) + valueToBeAdded);
			prefixTreeMap.put(upperLimit, getNotNullValue(prefixTreeMap.get(upperLimit)) - valueToBeAdded);
		}
		
		maxValue = 0;
		sumOfUntilPreviousIteration = 0;
		
		for(int prefixTreeMapValueElement : prefixTreeMap.values()) {
			
			sumOfUntilPreviousIteration +=  prefixTreeMapValueElement;
			
			if(maxValue < sumOfUntilPreviousIteration) {
				maxValue = sumOfUntilPreviousIteration;
			}
		}
		
		return maxValue;
	}

	private static int getNotNullValue(Integer value) {
		return null == value ? 0 : value;
	}

}
