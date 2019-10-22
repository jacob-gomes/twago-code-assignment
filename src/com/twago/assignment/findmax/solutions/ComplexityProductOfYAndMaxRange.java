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
public class ComplexityProductOfYAndMaxRange implements SolutionForFindingMax{

	@Override
	public int computeMaxValue(InputModel inputModel) {
		List<Integer> listOfXLength = new ArrayList<>(Collections.nCopies(inputModel.getX(), 0));
		int maxValue;
		
		for(InputModel.IJKCombination ijkCombination : inputModel.getIjkCombinationList()) {
			for(int index = ijkCombination.i - 1; index < ijkCombination.j; index++) {
				listOfXLength.set(index, listOfXLength.get(index) + ijkCombination.k);
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
