import java.util.Comparator;

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
		return this.profit + "\t" + this.duration + "\t" + this.deadline + "\t" + this.profit/this.duration;
	}
}
