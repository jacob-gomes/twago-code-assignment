package com.twago.assignment.findmax.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.twago.assignment.findmax.model.InputModel;

/**
 * 
 * @author Jacob
 *
 */

public class ComplexityProductOfYAndLogYTest {
	
	@Test
	public void computeMaxValueTestWithSameValuesOfK() {
		InputModel testInputModel = new InputModel();
		InputModel.IJKCombination testIJKCombination;
		int maxValue;
		
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
		
		maxValue = ComplexityProductOfYAndLogY.computeMaxValue(testInputModel);
		
		assertEquals(200, maxValue);
	}
	
	@Test
	public void computeMaxValueTestWithDifferentValuesOfK() {
		InputModel testInputModel = new InputModel();
		InputModel.IJKCombination testIJKCombination;
		int maxValue;
		
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
		testIJKCombination.k = 200;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 3;
		testIJKCombination.j = 4;
		testIJKCombination.k = 300;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		maxValue = ComplexityProductOfYAndLogY.computeMaxValue(testInputModel);
		
		assertEquals(500, maxValue);
	}
	
	@Test
	public void computeMaxValueTestWithLargerValueOfX() {
		InputModel testInputModel = new InputModel();
		InputModel.IJKCombination testIJKCombination;
		int maxValue;
		
		testInputModel.setX(10000);
		testInputModel.setY(3);
		testInputModel.setIjkCombinationList(new ArrayList<>());		
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 1;
		testIJKCombination.j = 500;
		testIJKCombination.k = 100;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 250;
		testIJKCombination.j = 750;
		testIJKCombination.k = 200;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		testIJKCombination = new InputModel.IJKCombination();
		testIJKCombination.i = 500;
		testIJKCombination.j = 1000;
		testIJKCombination.k = 300;
		testInputModel.getIjkCombinationList().add(testIJKCombination);
		
		maxValue = ComplexityProductOfYAndLogY.computeMaxValue(testInputModel);
		
		assertEquals(600, maxValue);
	}

}
