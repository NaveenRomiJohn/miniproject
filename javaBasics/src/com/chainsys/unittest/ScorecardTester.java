package com.chainsys.unittest;

import com.chainsys.classandmethods.T20Scorecard;

public class ScorecardTester 
{
	public static void testMatch()
	{
		T20Scorecard sb= new T20Scorecard(129);
		System.out.println("Target		: "+sb.getTarget());
		System.out.println("Max Overs	: "+T20Scorecard.maxOvers);
		sb.setCurrentScore(86);
		sb.setCompleted_overs(11);
		System.out.println("Current Score   : "+sb.getCurrentScore());
		System.out.println("Overs Completed	: "+sb.getCompleted_overs());
		System.out.println("Current RR	: "+sb.getCurrentRunRate());
		System.out.println("Required RR	: "+sb.getRequiredRunRate());	
	}
}
