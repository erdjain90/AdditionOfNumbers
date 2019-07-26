package com.deloitte.controller;

import java.io.File;

import com.deloitte.util.SipArchivalUtility;

public class SIPArchiveGenerator {

	public static void main(String[] args) throws Exception {
		
		int numberOfXmls = 0;
		int numberOfBatches = 0;

		SipArchivalUtility sipArchivalUtilityObj = new SipArchivalUtility();
		
		//numberOfXmls = sipArchivalUtilityObj.countOfXmls();
		
		numberOfBatches = getBatchCount(numberOfXmls);
		
		sipArchivalUtilityObj.createSIPDescriptor();
		
	}

	public static int getBatchCount(int numberOfXmls) 
	{
		int numberOfBatches;
		if(numberOfXmls%10 == 0)
		{
			numberOfBatches = numberOfXmls/10;
		}
		else
		{
			numberOfBatches = numberOfXmls/10 + 1;
		}
		return numberOfBatches;
	}

}
