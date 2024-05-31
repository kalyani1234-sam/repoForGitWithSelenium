package com.crm.listenersImplimentation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersRetryINTerface implements IRetryAnalyzer {
	int start=0,end=2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
	
		if (start<end) {
			start++;
			return true;
		}
		
		return false;
	}

}
