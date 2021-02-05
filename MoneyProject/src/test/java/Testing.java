import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class Testing {
	Money money = new Money("Programmer");
	MoneyWork work = new MoneyWork();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		money.setMoneyPerHour(8.99);
		double weekly = work.WeeklyPay(money);
		assertEquals(44.95,weekly,0.0);
	}
	@Test
	public void testAnother() {
		money.setMoneyPerHour(10.00);
		double weekly = work.WeeklyPay(money);
		assertNotEquals(10.00, weekly, 0.0);
	}

}
