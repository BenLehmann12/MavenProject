import java.util.Scanner;

public class MoneyWork {
	public double WeeklyPay(Money money) {
		System.out.println("How many hours do you work");  //Ask for how many hours worked
		Scanner scan = new Scanner(System.in);
		int hours = scan.nextInt();
		double weeklyPay = 0;
		weeklyPay = money.getMoneyPerHour() * hours;  //Pay = money made * # of hours
		return weeklyPay;
	}
	public boolean MedianPayPerHour(Money money) {
		if(money.getMoneyPerHour() < 19.33) {   //According to EPI, median pay per hour is 19.33
			return true;
		}
		else {
			return false;
		}
	}

}
