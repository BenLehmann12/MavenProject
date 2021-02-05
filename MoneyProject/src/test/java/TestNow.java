import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestNow {
	Money money = new Money("Engineer");
	MoneyWork work = new MoneyWork();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		money.setMoneyPerHour(10.99);
		double weekly = work.WeeklyPay(money);
		assertEquals(32.97,weekly,0.0);
	}

}
