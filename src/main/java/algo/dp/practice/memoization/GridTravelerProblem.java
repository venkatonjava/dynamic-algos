package algo.dp.practice.memoization;

import org.junit.Test;

public class GridTravelerProblem {

	public int gridTraveler(int x, int y) {
		if(x <1 || y < 1) {
			return 0;
		}
		if(x ==1 && y == 1) {
			return 1;
		}
		return gridTraveler(x-1, y) + gridTraveler(x, y-1); 
	}
	
	@Test
	public void gridTravelerTest() {
		System.out.println(gridTraveler(1, 1));
		System.out.println(gridTraveler(2, 3));
		System.out.println(gridTraveler(3, 3));
		System.out.println(gridTraveler(3, 2));
		System.out.println(gridTraveler(18, 18));
	}
}
