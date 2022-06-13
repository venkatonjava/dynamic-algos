package algo.dp.practice.memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.junit.Test;

public class GridTravelerProblemMemoization {

	public int gridTraveler(int x, int y, Map<Grid, Integer> map) {
		if(x <1 || y < 1) {
			return 0;
		}
		if(x ==1 && y == 1) {
			return 1;
		}
		Grid grid = new Grid(x, y);
		Integer n = map.get(grid);
		if(n == null) {
			n = gridTraveler(x-1, y, map) + gridTraveler(x, y-1, map);
			map.put(grid, n);
		}
		return n; 
	}
	
	@Test
	public void gridTravelerTest() {
		System.out.println(gridTraveler(1, 1, new HashMap<Grid, Integer>()));
		System.out.println(gridTraveler(2, 3, new HashMap<Grid, Integer>()));
		System.out.println(gridTraveler(3, 3, new HashMap<Grid, Integer>()));
		System.out.println(gridTraveler(3, 2, new HashMap<Grid, Integer>()));
		System.out.println(gridTraveler(18, 18, new HashMap<Grid, Integer>()));
	}
	
}
class Grid {
	int x;
	int y;
	
	public Grid(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hash(x, y);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grid other = (Grid) obj;
		return x == other.x && y == other.y;
	}
}
