package com.twago.assignment.findmax.model;

import java.util.List;

/**
 * 
 * @author Jacob
 *
 */
public class InputModel {

	private int X;
	
	private int Y;
	
	private List<IJKCombination> ijkCombinationList;

	public static class IJKCombination{
		public int i;
		
		public int j;
		
		public int k;
		
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return X;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		X = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return Y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		Y = y;
	}

	public List<IJKCombination> getIjkCombinationList() {
		return ijkCombinationList;
	}

	public void setIjkCombinationList(List<IJKCombination> ijkCombinationList) {
		this.ijkCombinationList = ijkCombinationList;
	}

	
}
