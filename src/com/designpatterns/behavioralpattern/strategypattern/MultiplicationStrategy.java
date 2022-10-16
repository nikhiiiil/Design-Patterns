package com.designpatterns.behavioralpattern.strategypattern;

public class MultiplicationStrategy implements Strategy {

	@Override
	public int execute(int a, int b) {
		return a * b;
	}

}
