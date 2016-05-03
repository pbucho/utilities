package pt.bucho.utilities.date;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Conveniences to transform strings into date objects 
 *
 * @deprecated Obsolete class. Use JodaTime instead 
 */
@Deprecated
public class DateUtils {
	
	/**
	 * Returns a date object given a string
	 * 
	 * @deprecated Should use JodaTime instead 
	 */
	@Deprecated
	public static Date getDate(String date) {
		
		String[] split = date.split("-");
		
		if (split.length != 3) {
			return null;
		}
		
		int year = Integer.parseInt(split[0]);
		int month = Integer.parseInt(split[1]);
		int day = Integer.parseInt(split[2]);
		
		if (year < 1970) {
			return null;
		}
		if ((month < 1) || (month > 12)) {
			return null;
		}
		if (day < 1) {
			return null;
		}
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (day > 31) {
					return null;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (day > 30) {
					return null;
				}
				break;
			case 2:
				if (year % 4 == 0) {
					if (day > 29) {
						return null;
					}
				} else if (day > 28) {
					return null;
				}
				break;
			default:
				return null;
		}
		Calendar calendar = new GregorianCalendar(year, month - 1, day);
		return calendar.getTime();
	}

	/**
	 * Returns a ZonedDateTime object given a string
	 * 
	 * @deprecated Should use JodaTime instead
	 */
	@Deprecated
	public static ZonedDateTime getCompleteDate(String original) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss Z").withLocale(Locale.ENGLISH);
		return ZonedDateTime.parse(original, dtf);
	}
}
