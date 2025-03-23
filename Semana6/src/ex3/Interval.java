package ex3;

import java.util.Iterator;

public class Interval implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Interval(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean isEmpty() {
        return min > max;
    }

    public int size() {
        return isEmpty() ? 0 : (max - min + 1);
    }

    public static Interval naturals(int max) {
        return new Interval(1, max);
    }

    public static Interval arrayIndexes(int[] array) {
        return new Interval(0, array.length - 1);
    }

    public static Interval empty() {
        return new Interval(0, -1); 
    }

    private class IntervalIterator implements Iterator<Integer> {
        private int current;

        public IntervalIterator() {
            this.current = min;
        }

        @Override
        public boolean hasNext() {
            return current <= max;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new IllegalStateException("Nao ha mais elementos no intervalo");
            }
            return current++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntervalIterator();
    }
    
    //d)
    public static void main(String[] args) {
    	Interval in = new Interval(3,5);
    	System.out.println(Main.average(() -> in.iterator() )); //4.0 ( 3+4+5 / 3 )
	}
}
