
public class Money {
	private String UserJob;
	private double moneyPerHour;   //Getters and Setters   Ben Lehmann
	                               //Ask for User Job and money made per hour
	public Money() {
		
	}
	public Money(String UserJob) {
		UserJob = UserJob;
	}
	
	public String getUserJob() {
		return UserJob;
	}
	public void setUserJob(String userJob) {
		UserJob = userJob;
	}
	public double getMoneyPerHour() {
		return moneyPerHour;
	}
	public void setMoneyPerHour(double moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}

}
