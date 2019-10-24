package com.twago.assignment.findmax.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.twago.assignment.findmax.model.InputModel;

/**
 * This solution has the medium complexity
 * Computes in a linear complexity of 
 * O(n) = O(X+Y)
 * @author Jacob
 *
 */
public class SolutionComplexitySumOfXAndY{

	private SolutionComplexitySumOfXAndY() {}
	
	public static int computeMaxValue(InputModel inputModel) {
		
		int maxValue;
		int lowerLimit;
		int upperLimit;
		int valueToBeAdded;
		List<Integer> listOfXLength = new ArrayList<>(Collections.nCopies(inputModel.getX() + 1, 0));
	
		for(InputModel.IJKCombination ijkCombination : inputModel.getIjkCombinationList()) {
			lowerLimit = ijkCombination.i;
			upperLimit = ijkCombination.j;
			valueToBeAdded = ijkCombination.k;
			
			listOfXLength.set(lowerLimit - 1, listOfXLength.get(lowerLimit - 1) + valueToBeAdded);
			listOfXLength.set(upperLimit, listOfXLength.get(upperLimit) - valueToBeAdded);
		}
		
		maxValue = 0;
		for(int index = 0 ; index < inputModel.getX(); index++) {
			listOfXLength.set(
					index + 1,
					listOfXLength.get(index) + listOfXLength.get(index + 1)  );
			
			if(maxValue < listOfXLength.get(index)) {
				maxValue = listOfXLength.get(index);
			}
		}
		
		return maxValue;
	}

}
