package ex1;

public class Ascending implements SortingPolicy{
	public boolean isBefore(int a, int b) {
		return a < b;
	}
}
