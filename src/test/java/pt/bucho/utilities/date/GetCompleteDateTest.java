package pt.bucho.utilities.date;

import java.time.ZonedDateTime;

import org.junit.Assert;
import org.junit.Test;

import pt.bucho.utilities.date.DateUtils;

@SuppressWarnings("deprecation")
public class GetCompleteDateTest {
	private String originalDate1 = "Sun, 25 Oct 2015 11:15:28 +0000";
	private String originalDate2 = "Fri, 23 Oct 2015 11:15:28 +0100";

	@Test
	public void westernEuropeTimeTest() {
		ZonedDateTime retrievedDate = DateUtils.getCompleteDate(this.originalDate1);
		Assert.assertEquals("2015-10-25T11:15:28Z", retrievedDate.toString());
	}

	@Test
	public void westernEuropeSummerTimeTest() {
		ZonedDateTime retrievedDate = DateUtils.getCompleteDate(this.originalDate2);
		Assert.assertEquals("2015-10-23T11:15:28+01:00", retrievedDate.toString());
	}
}
