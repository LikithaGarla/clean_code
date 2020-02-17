package com.epam.clean_code.clean-code;

import java.lang.Math.*;

// calculate interest
public class CalculateInterest{
	//simple interest calculation
	public float simpleInterest(float principle,float rate_of_interest, int time_period)
	{
		return (principle*rate_of_interest*time_period)/100;
	}
	
	//compound interest calculation
	public double compundInterest(double principle,double rate_of_interest, double time_period)
	{
		double compound_interest;
	    compound_interest = principle*pow((1+rate_of_interest/100),time_period);
	    return compound_interest;
	}
}
