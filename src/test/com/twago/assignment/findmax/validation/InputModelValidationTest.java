package com.twago.assignment.findmax.validation;

import java.util.ArrayList;

import org.junit.Test;

import com.twago.assignment.findmax.exception.InvalidDataException;
import com.twago.assignment.findmax.model.InputModel;

public class InputModelValidationTest {
	@Test
	public void validateTest() {
		InputModel testInputModel = new InputModel();
		InputModel.IJKCombination testIJKCombination;
		boolean isInvalidDataException = false;
		
		testInputModel.setX(5);
		testInputModel.setY(3);
		testInputModel.setIjkCombinationList(new ArrayList<>());		
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 1;
		testIJKCombination.j = 2;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 2;
		testIJKCombination.j = 5;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 3;
		testIJKCombination.j = 4;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		try {
			InputModelValidation.validate(testInputModel);
		}catch(InvalidDataException e) {
			isInvalidDataException = true;
		}
		
		assert(!isInvalidDataException);
	}
	
	
	@Test(expected = InvalidDataException.class)
	public void validateTestForValueOfXMoreThenExpected() {
		InputModel testInputModel = new InputModel();
		testInputModel.setX(10000001);
		
		InputModelValidation.validate(testInputModel);
	}
	
	@Test(expected = InvalidDataException.class)
	public void validateTestForValueOfYMoreThenExpected() {
		InputModel testInputModel = new InputModel();
		testInputModel.setY(10000001);
		
		InputModelValidation.validate(testInputModel);
	}
	
	@Test(expected = InvalidDataException.class)
	public void validateTestForNullInputModel() {
		InputModelValidation.validate(null);
	}
	
	
	@Test(expected = InvalidDataException.class)
	public void validateTestWithRangeOfYMismatchIJKCombinationListLength() {
		InputModel testInputModel = new InputModel();
		InputModel.IJKCombination testIJKCombination;
		
		testInputModel.setX(5);
		testInputModel.setY(3);
		testInputModel.setIjkCombinationList(new ArrayList<>());		
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 1;
		testIJKCombination.j = 2;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 2;
		testIJKCombination.j = 5;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 3;
		testIJKCombination.j = 4;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 3;
		testIJKCombination.j = 4;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		InputModelValidation.validate(testInputModel);
	}
	
	
	@Test(expected = InvalidDataException.class)
	public void computeMaxValueTestWithJGreaterThanX() {
		InputModel testInputModel = new InputModel();
		InputModel.IJKCombination testIJKCombination;
		
		testInputModel.setX(10000);
		testInputModel.setY(1);
		testInputModel.setIjkCombinationList(new ArrayList<>());		
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 1;
		testIJKCombination.j = 10001;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);


		InputModelValidation.validate(testInputModel);
		
	}
	
	@Test(expected = InvalidDataException.class)
	public void computeMaxValueTestWithILessThan1() {
		InputModel testInputModel = new InputModel();
		InputModel.IJKCombination testIJKCombination;
		
		testInputModel.setX(12);
		testInputModel.setY(1);
		testInputModel.setIjkCombinationList(new ArrayList<>());		
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 0;
		testIJKCombination.j = 2;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);


		InputModelValidation.validate(testInputModel);
		
	}
	
	@Test(expected = InvalidDataException.class)
	public void computeMaxValueTestWithkLessThan0() {
		InputModel testInputModel = new InputModel();
		InputModel.IJKCombination testIJKCombination;
		
		testInputModel.setX(12);
		testInputModel.setY(1);
		testInputModel.setIjkCombinationList(new ArrayList<>());		
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 1;
		testIJKCombination.j = 2;
		testIJKCombination.k = -1;
		testInputModel.getIjkCombinationList().add(testIJKCombination);


		InputModelValidation.validate(testInputModel);
		
	}
}
