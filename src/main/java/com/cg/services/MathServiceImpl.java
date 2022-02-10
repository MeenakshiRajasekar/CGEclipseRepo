package com.cg.services;

import com.cg.customExceptions.InvalidNumberRangeException;

public class MathServiceImpl implements MathService{

	public int add(int n1, int n2) throws InvalidNumberRangeException {
		
		if(n1>0 && n2>0) 
		return n1+n2;
		
		else
			throw new InvalidNumberRangeException("cannot add invalid numbers");
		
	}

	public int sub(int n1, int n2) throws InvalidNumberRangeException {
		
		if(n2>n1)
			return n2-n1;
		else
			throw new InvalidNumberRangeException("cannot subrtact invalid numbers");
	}

	public int mul(int n1, int n2) throws InvalidNumberRangeException {
				
		return 0;
	}

	public int div(int n1, int n2) throws InvalidNumberRangeException {
		
		return 0;
	}

	public int add1(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int add2(int n1, int n2) throws InvalidNumberRangeException {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
