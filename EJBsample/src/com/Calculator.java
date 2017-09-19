package com;
import javax.ejb.Stateless;

@Stateless(mappedName="calculator")
public class Calculator implements CalculatorLocal,CalculatorRemote {
public int add(int a, int b)
{
	return a+b;
}
}
