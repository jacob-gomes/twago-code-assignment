package com.twago.assignment.findmax.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.twago.assignment.findmax.model.InputModel;

public class ComputeKeyboardInputUtil {
	
	public void populateInputModelUsingKeyboardInputs(InputModel inputModel) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);  
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		InputModel.IJKCombination ijkCombination;
		String lineString;
		String[] lineElements;
		
		System.out.println("Enter X and Y in format: X<space>Y");
		lineString = bufferedReader.readLine();
		
		lineElements = lineString.split(" ");
		inputModel.setX(Integer.parseInt(lineElements[0]));
		inputModel.setY(Integer.parseInt(lineElements[1]));
		inputModel.setIjkCombinationList(new ArrayList<>());
		
		System.out.println("Enter i,j,k values for "+inputModel.getY()+" times in format: i<space>j<space>k<Enter>");
		for(int index = 0; index < inputModel.getY(); index++) {
			lineString = bufferedReader.readLine();			
			lineElements = lineString.split(" ");
			
			ijkCombination = new InputModel.IJKCombination();
			
			ijkCombination.i = Integer.parseInt(lineElements[0]);
			ijkCombination.j = Integer.parseInt(lineElements[1]);
			ijkCombination.k = Integer.parseInt(lineElements[2]);
			
			inputModel.getIjkCombinationList().add(ijkCombination);
		}
	}

}
