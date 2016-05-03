package pt.bucho.utilities.date;

import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pt.bucho.utilities.date.DateUtils;

@SuppressWarnings("deprecation")
public class GetDateTest {
	private Date hardDate1;
	private Date hardDate2;
	private Date hardDate3;

	@Before
	public void setUp() {
		this.hardDate1 = new Date(116, 0, 24);
		this.hardDate2 = new Date(116, 5, 24);
		this.hardDate3 = new Date(116, 1, 29);
	}

	@Test
	public void stringToDateTest() {
		Assert.assertEquals(this.hardDate1, DateUtils.getDate("2016-01-24"));
		Assert.assertEquals(this.hardDate2, DateUtils.getDate("2016-06-24"));
		Assert.assertEquals(this.hardDate3, DateUtils.getDate("2016-02-29"));

		Assert.assertNull(DateUtils.getDate("1500-10-20"));
		Assert.assertNull(DateUtils.getDate("2015-02-29"));
		Assert.assertNull(DateUtils.getDate("2015-12-32"));
		Assert.assertNull(DateUtils.getDate("2015-04-31"));
		Assert.assertNull(DateUtils.getDate("2015-13-31"));
		Assert.assertNull(DateUtils.getDate("2015"));
		Assert.assertNull(DateUtils.getDate("1969-08-15"));
	}
}
