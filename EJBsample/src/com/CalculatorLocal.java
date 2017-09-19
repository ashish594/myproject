package com;

import javax.ejb.Local;

@Local
public interface CalculatorLocal {
	
		public int add(int a, int b);
	}
