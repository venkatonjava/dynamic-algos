package algo.dp.practice.memoization;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
/**
 * 1 1 2 3 5 8 13 21 34 55 89 144
 * @author Nunna
 *
 */
public class FibonocciRecursionProblem {
	
	int count = 0;

	public Long fibMemo(int n, Map<Integer, Long> memoization) {
		count++;
		if(n <=2) {
			return 1l;
		}
		if(null != memoization.get(n)) {
			return memoization.get(n);
		}
		long fibNum =  fibMemo(n-2, memoization) + fibMemo(n-1, memoization);
		memoization.put(n, fibNum);
		return fibNum;
	}
	
	@Test
	public void fibMemoTest() {
	//	System.out.println(fib(5));
		count = 0;
		System.out.println(fibMemo(20, new HashMap<Integer, Long>()));
		System.out.println("fibMemoTest No Of Calls : " + count);
	}
	
	public Long fib(int n) {
		count++;
		if(n <=2) {
			return 1l;
		}
		return fib(n-2) + fib(n-1);
	}
	
	
	@Test
	public void fibTest() {
	//	System.out.println(fib(5));
		count = 0;
		System.out.println(fib(20));
		System.out.println("fibTest - No Of calls : " + count);
	}


}
