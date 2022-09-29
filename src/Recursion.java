public class Recursion {
	
	/**
	 * Returns the number of all positive numbers leading up to parameter n.
	 * 
	 * This method has a big O complexity of N.
	 * 
	 * @param n is the number that you want to add up to.
	 * @return either zero (the base case) or sum method adding the value of n-1 to the 
	 * current value of n.
	 */
	public static int sum(int n){

		// If there are no more numbers to add, n (0) is returned to the previous sum() on the call stack.\
		
		if(n==0)
		{
			return n;
		}
		
		/*
		 * If there are more numbers to add, a sum method adding the value of n-1 to 
		 * the current value of n is called.
		 */
		
		else
		{
			return sum(n-1) + n;
		}
		
	}

	/**
	 * Method multiplies two numbers together by recursively adding the 1st number to itself
	 * the 2nd number amount of times. It does so by taking one away from n (or adding one
	 * to n if it is negative) every time m is added to itself until n is equal to zero.
	 * 
	 * This method has a big O complexity of N.
	 * 
	 * @param m the first number
	 * @param n the second number
	 * @return the first number times the second number.
	 */
	public static int multiply(int m, int n){
		
		//Returns if n is zero.
		if(n == 0)
		{
			return 0;
		}
		else
		{
			if (n>0)
			{
				//Returns if n is positive.
				return m + multiply(m,n-1);
			}
			else
			{
				//Returns if n is positive.
				return - m + multiply(m,n+1);
			}
			
		}
		
	}
	
	/**
	 * Method Fibonacci() prints all the numbers in the Fibonacci sequence up to the nth digit
	 * by using recursion. It starts at the nth digit and adds the n-1th digit to the n-2nd
	 * digit together recursively until n is either 1 or 0. It then sends the method up the call
	 * stack.
	 * 
	 * This method has a big O complexity of N^2.
	 * 
	 * @param n is how many numbers of the Fibonacci sequence you want to print.
	 * @return all the numbers in the Fibonacci sequence up to the nth digit. 
	 */
	public static int Fibonacci(int n){
		
		/*
		 * returns n when it is 0 or 1 to avoid hitting negative numbers, which would break the
		 * recursive method, as well as be invalid. This is because negative numbers are not 
		 * in the Fibonacci sequence.
		 */
		
		if(n==0)
		{
			return 0;
		}
		else if(n==1) 
		{
			return 1;
		}
		else 
		{
			return Fibonacci(n-2) + Fibonacci(n-1);
		}
	}


}