package com.chainsys.classandmethods;

public class T20Scorecard 
{
	private int target;
	public final static int maxOvers=20;
	public T20Scorecard(int targetscore)
	{
		this.target=targetscore;
	}
	public final int getTarget()
	{
		return target;
	}
	
	private int currentScore;
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore=currentScore;
	}
	public double getCurrentRunRate()
	{
		return (double)currentScore/completed_overs;
	}
	
	private int runRate;
	public int getRunRate() {
		return runRate;
	}
	public void setRunRate(int runRate) {
		this.runRate = runRate;
	}
	
	private int completed_overs;
	public int getCompleted_overs() {
		return completed_overs;
	}
	public void setCompleted_overs(int completed_overs) {
		this.completed_overs = completed_overs;
	}
	
	public double getRequiredRunRate()
	{
		int runsToScore=(target-currentScore);
		int oversRemaining= (maxOvers - completed_overs);
		return runsToScore/(double)oversRemaining;
	}
	
}
