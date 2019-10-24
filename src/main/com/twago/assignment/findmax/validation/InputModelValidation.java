package com.twago.assignment.findmax.validation;

import com.twago.assignment.findmax.exception.InvalidDataException;
import com.twago.assignment.findmax.model.InputModel;

public class InputModelValidation {
	
	public static void validate (InputModel inputModel) {
		
		if(null == inputModel) {
			throw new InvalidDataException("inputModel cannot be null");
		}
		
		if(inputModel.getX() > 10000000) {
			throw new InvalidDataException("X cannot be greater then 10000000");
		}
		
		if(inputModel.getY() > 200000) {
			throw new InvalidDataException("Y cannot be greater then 200000");
		}
		
		if(null == inputModel.getIjkCombinationList() || inputModel.getY() != inputModel.getIjkCombinationList().size()) {
			throw new InvalidDataException("Length of Y and entered i,j,k combination do not match");
		}
		
		for(InputModel.IJKCombination ijkCombination : inputModel.getIjkCombinationList()) {
			if(ijkCombination.i < 1) {
				throw new InvalidDataException("i cannot be less than 1");
			}
			
			if(ijkCombination.j > inputModel.getX()) {
				throw new InvalidDataException("j cannot be greater than X");
			}
			
			if(ijkCombination.k < 0 ) {
				throw new InvalidDataException("k cannot be negetive");
			}
		}
			
	}
}
