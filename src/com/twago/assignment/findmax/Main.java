/**
 * 
 */
package com.twago.assignment.findmax;

import java.io.IOException;

import com.twago.assignment.findmax.constants.SolutionType;
import com.twago.assignment.findmax.model.InputModel;
import com.twago.assignment.findmax.solutions.SolutionForFindingMax;
import com.twago.assignment.findmax.solutions.factory.SolutionFactory;
import com.twago.assignment.findmax.util.ComputeKeyboardInputUtil;

/**
 * @author Jacob
 *
 */
public class Main {
	
	static SolutionType solutionChoice = SolutionType.HIGHEST_COMPLEXITY; 

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		SolutionForFindingMax solutionForFindingMax;
		int maxValue;
		InputModel inputModel = new InputModel();
		ComputeKeyboardInputUtil computeKeyboardInputUtil = new ComputeKeyboardInputUtil();
		
		computeKeyboardInputUtil.populateInputModelUsingKeyboardInputs(inputModel);
		
		solutionForFindingMax = SolutionFactory.getSolutionForFindingMaxImplDependingOnComplexity(solutionChoice);
		
		maxValue = solutionForFindingMax.computeMaxValue(inputModel);
		
		System.out.println(maxValue);
	}
}
