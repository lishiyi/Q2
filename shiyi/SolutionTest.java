package shiyi;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
	
	@Test
	public void test() {
		
		assertEquals("Input number is negative, please try again.", Solution.getResult(Integer.MIN_VALUE));
		assertEquals("Input number is negative, please try again.", Solution.getResult(-1));
		assertEquals("0", Solution.getResult(0));
		assertEquals("0 1", Solution.getResult(1));
		assertEquals("0 1 1", Solution.getResult(2));
		assertEquals("0 1 1 2", Solution.getResult(3));
		assertEquals("0 1 1 2 3", Solution.getResult(4));
		assertEquals("0 1 1 2 3 5", Solution.getResult(5));
		assertEquals("0 1 1 2 3 5 8", Solution.getResult(6));
		assertEquals("0 1 1 2 3 5 8 13", Solution.getResult(7));
		assertEquals("0 1 1 2 3 5 8 13 21", Solution.getResult(8));
		assertEquals("0 1 1 2 3 5 8 13 21 34", Solution.getResult(9));
		assertEquals("0 1 1 2 3 5 8 13 21 34 55", Solution.getResult(10));
		assertEquals("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765", Solution.getResult(20));
		assertEquals("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040", Solution.getResult(30));
		assertEquals("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155", Solution.getResult(40));
		assertEquals("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155 165580141 267914296 433494437 701408733 1134903170 1836311903 2971215073 4807526976 7778742049 12586269025", Solution.getResult(50));
		assertEquals("Input number is too large, please try again.", Solution.getResult(93));
		assertEquals("Input number is too large, please try again.", Solution.getResult(Integer.MAX_VALUE));
	}

}
