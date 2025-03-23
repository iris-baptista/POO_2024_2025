package aulaTeorica;

public enum WeekDay {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	public boolean isWeekend() {
		return this == SATURDAY || this == SUNDAY;
	}
	
	public WeekDay nextDay() {
		if(this == SUNDAY)
			return MONDAY;
		return values()[ordinal() +1];
	}
}
