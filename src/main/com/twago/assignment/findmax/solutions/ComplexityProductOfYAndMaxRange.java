package com.twago.assignment.findmax.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.twago.assignment.findmax.model.InputModel;

/**
 * This solution has the highest complexity
 * O(n) = O(Y*(MAX(DIFFERENCE BETWEEN i AND j)))
 * @author Jacob
 *
 */
public class ComplexityProductOfYAndMaxRange{

	private ComplexityProductOfYAndMaxRange() {}
	
	public static int computeMaxValue(InputModel inputModel) {
		
		int maxValue;
		int lowerLimit;
		int upperLimit;
		int valueToBeAdded;
		List<Integer> listOfXLength = new ArrayList<>(Collections.nCopies(inputModel.getX(), 0));
		
		for(InputModel.IJKCombination ijkCombination : inputModel.getIjkCombinationList()) {
			lowerLimit = ijkCombination.i;
			upperLimit = ijkCombination.j;
			valueToBeAdded = ijkCombination.k;
			
			for(int index = lowerLimit - 1; index < upperLimit; index++) {
				listOfXLength.set(index, listOfXLength.get(index) + valueToBeAdded);
			}
			//listOfXLength.forEach(System.out::print);
			//System.out.println("");
		}
		
		maxValue = listOfXLength.stream().max(
				(firstElement, secondElement) -> (firstElement - secondElement))
				.orElse(0);
		
		return maxValue;
	}

}
