package ex2;

import ex5.Time;

public class Teste {

	public static void main(String[] args) {
				
		Time t0 = new Time(45,30);
		Time t1 = new Time("30:45");

		System.out.println("t0: " + t0);  						// 45:30
		System.out.println("t1: " + t1);						// 30:45
		System.out.println("t0+t1: " + t0.toString(t0.addTime(t1)));				// 76:15
		System.out.println("t1-t0: " + t0.toString(t0.subtractTime(t1)));				// 14:45
		System.out.println("t1>t0?: " + t1.isLarger(t0));  // false
		System.out.println("t1<t0?: " + t1.isSmaller(t0));	    // true
	}		
}
