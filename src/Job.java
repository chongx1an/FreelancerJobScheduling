
public class Job {
	private int profit;
	private int startDay;
	private int finishDay;
	private int duration;
	private int deadline;

	
	public Job(int profit, int duration, int deadline) {
		this.profit = profit;
		this.duration = duration;
		this.deadline = deadline;
	}
	
	public int getProfit() {
		return this.profit;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public int getDeadline() {
		return this.deadline;
	}
	
	public int getRatio() {
		return this.profit/this.duration;
	}

	public String toString() {
		return String.format("%-15d%-15d%-15d%-15d", this.profit, this.duration, this.deadline, this.profit/this.duration);
		
	}
}
