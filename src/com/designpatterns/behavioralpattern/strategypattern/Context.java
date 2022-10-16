package com.designpatterns.behavioralpattern.strategypattern;

public class Context {
	
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int firstNum, int secondNum) {
		return strategy.execute(firstNum, secondNum);
	}
}
