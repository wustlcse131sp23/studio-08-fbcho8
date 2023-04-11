package studio8;

import java.util.Objects;

public class Time {
private int hour;
private int minute;
private boolean isMilitary;

/**
 * 
 * @param hour
 * @param minute
 * @param isMilitary
 */
public Time (int hour, int minute, boolean isMilitary) {
	this.hour = hour;
	this.minute = minute;
	this.isMilitary = isMilitary;
}
public String toString() {
	if (isMilitary) {
		return hour + ":" + minute;
	}
	else {
		if (hour > 12) {
			return (hour-12) + ":" + minute + " PM"; 
		}
		else if (hour == 12) {
			return hour + ":" + minute + " PM";
		}
		else {
			return hour + ":" + minute + " AM";
		}
	}
}

	@Override
public int hashCode() {
	return Objects.hash(hour, minute);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Time other = (Time) obj;
	return hour == other.hour && minute == other.minute;
}

	public static void main(String[] args) {
		Time nowUS = new Time(13, 31, false);
		Time nowCanada = new Time(13, 31, true);
		System.out.println(nowUS.toString());
		System.out.println(nowCanada.toString());
    }

}