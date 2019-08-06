package demo;

public class TestTime {

	public static void main(String[] args) {
		Time t1 = new Time(10, 20, 30);
		Time t2 = new Time(10, 20, 30);
		Time t3 = new Time(10, 15, 30);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t2.equals(t1));
		System.out.println(t1.equals(t3));
	}

}

class Time{
	private int hours, mints, sec;

	public Time(int hours, int mints, int sec) {
		super();
		this.hours = hours;
		this.mints = mints;
		this.sec = sec;
	}
	
	public int getTotalSeconds() {
		return hours * 60 * 60 + mints * 60 + sec;
	}

	@Override
	public int hashCode() {
		return hours;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Time) {
			Time t = (Time) obj;
			return t.getTotalSeconds() == this.getTotalSeconds();
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return String.format("%2d:%2d:%2d",hours,mints,sec);
	}
	
}
