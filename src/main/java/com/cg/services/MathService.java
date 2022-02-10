package com.cg.services;

import com.cg.customExceptions.InvalidNumberRangeException;

public interface MathService {
	
	//we are creating interface because developers will create abstractions 1st
	
	//what part alone -(specifications)
	int add(int n1, int n2) throws InvalidNumberRangeException; // add function expecting two integer parameter and return in int format
	int sub(int n1, int n2) throws InvalidNumberRangeException; //incase of improper values exception will thrown
	int mul(int n1, int n2) throws InvalidNumberRangeException;
	int div(int n1, int n2) throws InvalidNumberRangeException;
	
	int add1(int n1, int n2) throws InvalidNumberRangeException;
	int add2(int n1, int n2) throws InvalidNumberRangeException;

	//whoever implementing this,  will follow requirements accordingly
	

}
