package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
private String month;
private int day;
private int year;
private boolean isHoliday;
/*/Constructor
 * @param month is the month
 * @param day is the day (1-31)
 * @param year is the year
 * @param isHoliday is whether the date in a holiday
 */
 

public Date (String month, int day, int year, boolean isHoliday) {
	this.month = month;
	this.day = day;
	this.year = year;
	this.isHoliday = isHoliday;
}
public String toString() {
	if (isHoliday) {
	return this.month + " " + this.day + ", " + this.year + " Is a holiday!";	
	}
	return this.month + " " + this.day + ", " + this.year + " Is NOT a holiday!"; 
}
    public static void main(String[] args) {
    	Date today = new Date("April", 4, 2023, false);
    	Date alsoToday = new Date("April", 4, 2023, false);
    	Date KaiBday = new Date("August", 24, 2004, true);
    	Date MylesBday = new Date("October", 23, 2003, true);
    	Date litDay = new Date("April", 20, 2023, true);
    	Date BerkayBday = new Date("July", 9, 2001, true);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(today);
    	list.add(KaiBday);
    	list.add(MylesBday);
    	list.add(litDay);
    	list.add(BerkayBday);
    	list.add(alsoToday);
    	System.out.println(list);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(today);
    	set.add(alsoToday);
    	set.add(KaiBday);
    	System.out.println(set);

    }
	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && Objects.equals(month, other.month)
				&& year == other.year;
	}
	
	
}
